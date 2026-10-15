package com.example.thaitruonggiang_layout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.thaitruonggiang_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Khai báo biến binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo binding và set view
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Bắt sự kiện CheckBox
        binding.cbAndroid.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Đã thêm" else "Đã bỏ"
            Toast.makeText(this, "$status môn Lập trình Android", Toast.LENGTH_SHORT).show()
        }

        // 1. Bắt sự kiện CheckBox
        binding.cbWeb.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Đã thêm" else "Đã bỏ"
            Toast.makeText(this, "$status môn Lập trình Web", Toast.LENGTH_SHORT).show()
        }

        // 2. Bắt sự kiện RadioGroup
        binding.rgMajor.setOnCheckedChangeListener { _, checkedId ->
            val major = if (checkedId == R.id.rbIT) "CNTT" else "Trí tuệ nhân tạo"
            Toast.makeText(this, "Bạn đã chọn chuyên ngành: $major", Toast.LENGTH_SHORT).show()
        }

        // 3. Bắt sự kiện Switch
        binding.switchSchedule.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Bật" else "Tắt"
            Toast.makeText(this, "$status nhận thông báo lịch học", Toast.LENGTH_SHORT).show()
        }

        // 3. Bắt sự kiện Switch
        binding.switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "Bật" else "Tắt"
            Toast.makeText(this, "Giao diện Dark Mode: $status", Toast.LENGTH_SHORT).show()
        }
    }
}