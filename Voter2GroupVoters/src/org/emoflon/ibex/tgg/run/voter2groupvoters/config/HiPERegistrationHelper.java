package org.emoflon.ibex.tgg.run.voter2groupvoters.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.voter2groupvoters.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Voter2GroupVoters.Voter2GroupVotersPackage;
import Voter2GroupVoters.impl.Voter2GroupVotersPackageImpl;
import Voter.impl.VoterPackageImpl;
import GroupVoters.impl.GroupVotersPackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage voterPack = null;
		EPackage groupvotersPack = null;
		EPackage voter2groupvotersPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/GroupVoters/model/GroupVoters.ecore");
			groupvotersPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Voter2GroupVoters/model/Voter2GroupVoters.ecore");
			voter2groupvotersPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Voter/model/Voter.ecore");
			voterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Voter2GroupVoters/model/Voter2GroupVoters.ecore");
			voter2groupvotersPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(voterPack == null)
			voterPack = VoterPackageImpl.init();
				
		if(groupvotersPack == null)
			groupvotersPack = GroupVotersPackageImpl.init();
		
		if(voter2groupvotersPack == null) {
			voter2groupvotersPack = Voter2GroupVotersPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Voter2GroupVoters/model/Voter2GroupVoters.ecore", Voter2GroupVotersPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Voter2GroupVoters/model/Voter2GroupVoters.ecore", Voter2GroupVotersPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/Voter/model/Voter.ecore", voterPack);
	    rs.getPackageRegistry().put("platform:/plugin/Voter/model/Voter.ecore", voterPack);	
			
		rs.getPackageRegistry().put("platform:/resource/GroupVoters/model/GroupVoters.ecore", groupvotersPack);
		rs.getPackageRegistry().put("platform:/plugin/GroupVoters/model/GroupVoters.ecore", groupvotersPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Voter2GroupVoters");
		options.project.path("Voter2GroupVoters");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
