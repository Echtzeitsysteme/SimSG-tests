# SimSG-tests
This repository provides Demos and Unit-Tests for the [SimSG](https://github.com/Echtzeitsysteme/SimSG) simulation tool.

## Requirements
* Java SE 8 or higher
* Eclipse Modeling Tools
* Working [eMoflon](https://github.com/eMoflon/emoflon-ibex) setup
* [SimSG](https://github.com/Echtzeitsysteme/SimSG)

If you don't already have a working setup of eMoflon it is recommended to start with a fresh and clean install of eclipse as provided by the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-modeling-tools).


## How to Use
Follow the installation guide of the SimSG tool (https://github.com/Echtzeitsysteme/SimSG), which includes all the necessary setup steps.

### Run the example
This repository contains a working example model of the so-called *Goldbeter-Koshland-Loop (GKL)*. You can find it in the `org.simsg.applications.gklsimulation`-project. To see it in action, follow these instructions in your dynamic workspace (i.e., start a new eclipse workspace from within your currently running development workspace):
1. Import the `GoldbeterKoshland`-project (or import via the .psf-file) containing the GK-metamodel and build to generate code: First, open the "model" subfolder. Then, open the genmodel-File, right-click inside the new window and click on "Generate Model Code".  
2. Import the `org.simsg.applications.gklsimulation`-project or import via the .psf-file (https://raw.githubusercontent.com/Echtzeitsysteme/SimSG-tests/master/projectSet.psf).
3. Build it by right-clicking and choosing `SimSG -> Build selected projects fully` or using the corresponding icon in the toolbar while in the SimSG perspective and refresh (F5).
4. If you still have errors in your workspace, try enabling "Build Automatically" and refresh your projects (F5).
5. Now you are able to run e.g. `Benchmark` in `org.simsg.applications.gklsimulation.benchmark`.
