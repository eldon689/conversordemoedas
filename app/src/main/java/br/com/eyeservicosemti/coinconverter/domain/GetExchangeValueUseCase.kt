package br.com.eyeservicosemti.coinconverter.domain

import br.com.eyeservicosemti.coinconverter.core.UseCase
import br.com.eyeservicosemti.coinconverter.data.model.ExchangeResponseValue
import br.com.eyeservicosemti.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}