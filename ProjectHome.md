# Context Manager Framework #

Context Manager Framework is a ongoing work at Department of Engineering and Computer Science and Mathematics at University of L'Aquila.

It includes model-based methodologies and tools to support the non-functional (a.k.a. extra-functional) of context-aware software systems.

Details on the current ongoing work follow.

## Multidimensional Context Modeling Applied to Non-Functional Analysis of Software ##

### Methodology ###
Context-awareness is a first-class attribute of today software
systems. Indeed, applications for mobile devices need to be aware
of their context in order to adapt their structure and behavior for offering the best quality of service even in case the software and hardware resources are limited. Modeling the context, its evolution, and its influence on the services provided by
resource-constrained applications are becoming primary activities throughout the whole software life cycle.

We propose a framework for modeling and reasoning on the context and its evolution along multiple dimensions. Our context model enables the stochastic analysis of context evolution and the representation of interdependencies among heterogeneous context attributes through a formally defined semantics for attribute composition. As a result, all context dimensions can be part of model-based processes and their cross-effects can be considered since the architectural design phase.
Multidimensional context analysis results can then be used as input to design and non-functional analysis methodologies for software systems.

We demonstrate how certain types of analysis, not feasible with context-agnostic models, are enabled in our framework by explicitly representing the interplay between context evolution and quality of service. The framework is shown at work on a running case study.


This work is inspired by a scientific paper presented at [FASE 2010](http://www.mathematik.uni-marburg.de/~swt/fase2010/).

A new extended version is currently under review for publication.
Additional material (UML Models, Excel files) can be found in **Downloads** zipped in **ContextModelingAndAnalysis**.

### Tools ###

We developed two main components:

**_CME_ (Context Model Editor), a GMF-based editor to create context models, namely First-Order Managers (a.k.a., AwarenessManagers in [1](http://www.mathematik.uni-marburg.de/~swt/fase2010/)) and Higher-Order Manager (a.k.a., ContextManagers in [1](http://www.mathematik.uni-marburg.de/~swt/fase2010/)) .**

**_MICE_ (Monitoring and modelIng Context Evolution), a distributed tool that
is capable to monitor, retrieve heterogeneous data from any IP-enabled
device. Such data are then used to parametrize with real-world measured data the
Awareness Managers.**

Both CME and MICE are continuosly evolving tools.
Both can be downloaded [here](http://code.google.com/a/eclipselabs.org/p/context-manager/downloads/list).

For more information about them, please contact  [Luca Berardinelli](http://www.di.univaq.it/luca.berardinelli/)