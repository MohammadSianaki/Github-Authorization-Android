package com.mydigipay.challenge.di

import com.mydigipay.challenge.domain.interactors.GetAccessTokenUsecase
import com.mydigipay.challenge.domain.interactors.GetCommitsUsecase
import com.mydigipay.challenge.domain.interactors.SearchRepositoriesUsecase
import org.koin.dsl.module


val usecaseModule = module {
    factory { GetAccessTokenUsecase(get()) }
    factory { SearchRepositoriesUsecase(get()) }
    factory { GetCommitsUsecase(get()) }
}