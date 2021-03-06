package com.mydigipay.challenge.domain.interactors

import com.github.mohammadsianaki.core.model.Result
import com.mydigipay.challenge.domain.entities.AccessTokenEntity
import com.mydigipay.challenge.domain.repositories.token.TokenRepository
import com.mydigipay.challenge.presentation.model.AccessTokenRequestConfigs
import com.mydigipay.challenge.presentation.ui.github.GithubViewModel

class GetAccessTokenUsecase(private val repository: TokenRepository) :
    Usecase<Result<AccessTokenEntity>>() {

    override suspend fun execute(data: Map<String, Any>?): Result<AccessTokenEntity> {
        return data?.let {
            val configs = it[GithubViewModel.KEY_CONFIGS] as AccessTokenRequestConfigs
            repository.fetchAccessToken(
                configs.clientId,
                configs.clientSecret,
                configs.code,
                configs.redirectUri,
                configs.state
            )
        } ?: run { Result.Success(AccessTokenEntity()) }
    }
}