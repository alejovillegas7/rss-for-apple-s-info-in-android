package com.example.top_10_downloader

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "on create called")
        val downloadData = DownloadData()
        downloadData.execute("your url goes here")
        Log.d(TAG, "on create done")
    }

    companion object {
        private class DownloadData: AsyncTask<String, Void, String>(){
            private val TAG = "Download Data"

            override fun doInBackground(vararg params: String?): String {
                Log.d(TAG, "doInBackground called, and starts in ${params[0]}")
                return "doInBackground completed"
            }

            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                Log.d(TAG, "onPostExecute called, wich result is: $result")
            }
        }
    }
}