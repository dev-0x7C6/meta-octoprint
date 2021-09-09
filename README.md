## OpenEmbedded / Yocto software layer for Octoprint and additional 3d-printing tools

This layer provides Octoprint front-end and 3d-printing tools
recipes for use with OpenEmbedded and/or Yocto.


## Layer dependencies

| Layer                                                                   | Sublayer           | Required           |
|:------------------------------------------------------------------------|:-------------------|:------------------:|
| [openembedded-core](https://github.com/openembedded/openembedded-core)  | meta               | :heavy_check_mark: |
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-oe            | :heavy_check_mark: |
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-multimedia    | :heavy_check_mark: |           
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-python        | :heavy_check_mark: |          
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-networking    | :heavy_check_mark: |
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-perl          | :heavy_check_mark: |                    
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-webserver     | :heavy_check_mark: |


## Layer origin

Layer is based on old meta-maker layer

Original autors behind meta-maker:
* Denys "denix" Dmytriyenko <denis@denix.org>
* Tim "moto-timo" Orling <TicoTimo@gmail.com>
* Koen Kooi <koen@dominion.thruhere.net>
