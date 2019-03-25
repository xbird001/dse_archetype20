    1、该项目是用于生成开发总体框架的项目源代码的maven的archetype，主要是生成maven多模块项目，其中最外层的项目作为父项目，管理项目的所有maven子模块，其中dse_manager
作为聚合项目，依赖其他所有的子模块业务包，dse_demo是事例代码，其中dse_demo可以单独编译、运行、测试、打包(配合打包插件)、发布；也可以打成jar包后，被dse_manager依赖，
作为一个整体项目，然后在打包。
    2、如若要生成子模块的框架代码，配合项目dse_module_archetype进行生成，二者进行配合可实现开发框架的快速搭建。业务代码可以通过项目code-generator进行生成；