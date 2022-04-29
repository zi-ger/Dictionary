package dev.ziger.dictionary.feature_dictionary.domain.repository

import dev.ziger.dictionary.core.util.Resource
import dev.ziger.dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}