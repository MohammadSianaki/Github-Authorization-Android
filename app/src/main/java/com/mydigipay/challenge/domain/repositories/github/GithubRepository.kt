package com.mydigipay.challenge.domain.repositories.github

import com.github.mohammadsianaki.core.model.Result
import com.mydigipay.challenge.domain.entities.SearchItemEntity

interface GithubRepository {
    suspend fun performSearch(query: String): Result<List<SearchItemEntity>?>
}