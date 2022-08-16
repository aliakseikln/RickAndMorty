package com.example.rickandmorty.viewmodel

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.rickandmorty.api.ApiService
import com.example.rickandmorty.paging.RickMortyPagingSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel()
class RickMortyViewModel
@Inject constructor(private val apiService: ApiService) : ViewModel() {

    val listData = Pager(PagingConfig(pageSize = 1)) {
        RickMortyPagingSource(apiService)
    }

}