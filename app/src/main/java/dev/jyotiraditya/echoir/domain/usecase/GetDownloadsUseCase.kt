package dev.jyotiraditya.echoir.domain.usecase

import dev.jyotiraditya.echoir.domain.model.Download
import dev.jyotiraditya.echoir.domain.repository.DownloadRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDownloadsUseCase @Inject constructor(
    private val repository: DownloadRepository
) {
    fun getActiveDownloads(): Flow<List<Download>> =
        repository.getActiveDownloads()

    fun getDownloadHistory(): Flow<List<Download>> =
        repository.getDownloadHistory()
}