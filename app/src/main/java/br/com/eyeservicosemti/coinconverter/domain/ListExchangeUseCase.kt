package br.com.eyeservicosemti.coinconverter.domain

import br.com.eyeservicosemti.coinconverter.core.UseCase
import br.com.eyeservicosemti.coinconverter.data.model.ExchangeResponseValue
import br.com.eyeservicosemti.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}