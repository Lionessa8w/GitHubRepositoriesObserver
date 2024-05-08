package ru.marina.githubrepositoriesobserver.maper

import javax.inject.Inject
import ru.marina.githubrepositoriesobserver.entity.SingInResponseRepositoryBriefInfoEntity
import ru.marina.githubrepositoriesobserver.model.RepositoriesModel

class RepositoriesModelMapper @Inject constructor(){

    operator fun invoke(model: SingInResponseRepositoryBriefInfoEntity): RepositoriesModel {
        return RepositoriesModel(name = model.name,
            description = model.description,
            kotlinOrJava = model.kotlinOrJava)
    }

}
