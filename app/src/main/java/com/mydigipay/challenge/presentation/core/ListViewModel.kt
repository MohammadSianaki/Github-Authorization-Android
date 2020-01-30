import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.mohammadsianaki.core.model.Resource
import com.mydigipay.challenge.presentation.core.ItemModel

abstract class ListViewModel<T : ItemModel> : ViewModel() {
    protected val liveData = MutableLiveData<Resource<List<T>>>()
    fun getLiveData(): LiveData<Resource<List<T>>> = liveData
}