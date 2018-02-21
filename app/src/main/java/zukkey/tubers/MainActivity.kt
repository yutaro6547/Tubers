package zukkey.tubers

import android.databinding.DataBindingUtil
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import zukkey.tubers.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    binding.navigation.setOnNavigationItemSelectedListener { item ->
      when (item.itemId) {
        R.id.navigation_home -> {
          binding.message.setText(R.string.title_home)
        }
        R.id.navigation_dashboard -> {
          binding.message.setText(R.string.title_dashboard)
        }
        R.id.navigation_notifications -> {
          binding.message.setText(R.string.title_notifications)
        }
      }
      false
    }
  }
}
