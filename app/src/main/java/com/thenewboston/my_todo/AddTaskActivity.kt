/*
package com.thenewboston.my_todo

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AddTaskActivity : AppCompatActivity() {
    private var editTextTask: EditText? = null
    private var editTextDesc: EditText? = null
    private var editTextFinishBy: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
        editTextTask = findViewById(R.id.editTextTask)
        editTextDesc = findViewById(R.id.editTextDesc)
        editTextFinishBy = findViewById(R.id.editTextFinishBy)
        findViewById<View>(R.id.button_save).setOnClickListener { saveTask() }
    }

    private fun saveTask() {
        val sTask = editTextTask!!.text.toString().trim { it <= ' ' }
        val sDesc = editTextDesc!!.text.toString().trim { it <= ' ' }
        val sFinishBy = editTextFinishBy!!.text.toString().trim { it <= ' ' }
        if (sTask.isEmpty()) {
            editTextTask!!.error = "Task required"
            editTextTask!!.requestFocus()
            return
        }
        if (sDesc.isEmpty()) {
            editTextDesc!!.error = "Desc required"
            editTextDesc!!.requestFocus()
            return
        }
        if (sFinishBy.isEmpty()) {
            editTextFinishBy!!.error = "Finish by required"
            editTextFinishBy!!.requestFocus()
            return
        }
        class SaveTask :
            AsyncTask<Void?, Void?, Void?>() {
            protected override fun doInBackground(vararg voids: Void): Void? { //creating a task
                val task = Task()
                task.task = sTask
                task.desc = sDesc
                task.finishBy = sFinishBy
                task.isFinished = false
                //adding to database
                DatabaseClient.getInstance(applicationContext).getAppDatabase()
                    .taskDao()
                    .insert(task)
                return null
            }

            override fun onPostExecute(aVoid: Void?) {
                super.onPostExecute(aVoid)
                finish()
                startActivity(Intent(applicationContext, MainActivity::class.java))
                Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
            }
        }

        val st = SaveTask()
        st.execute()
    }
}
*/
package com.thenewboston.my_todo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AddTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kt)
    }
}
