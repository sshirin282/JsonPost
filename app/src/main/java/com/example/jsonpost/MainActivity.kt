package com.example.jsonpost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import de.hdodenhof.circleimageview.CircleImageView
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    lateinit var circleImageView: CircleImageView
    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    lateinit var textView5: TextView
    lateinit var textView6: TextView
    lateinit var textView7: TextView
    lateinit var textView8: TextView
    lateinit var textView9: TextView
    lateinit var textView10: TextView
    lateinit var textView11: TextView
    lateinit var textView12: TextView
    lateinit var textView13: TextView
    lateinit var textView14: TextView
    lateinit var textView15: TextView
    lateinit var textView16: TextView
    lateinit var textView17: TextView
    lateinit var textView18: TextView
    lateinit var textView19: TextView
    lateinit var textView20: TextView
    lateinit var textView21: TextView
    lateinit var textView22: TextView
    lateinit var textView23: TextView
    lateinit var textView24: TextView
    lateinit var textView25: TextView
    lateinit var textView26: TextView
    lateinit var textView27: TextView


    val url: String = "https://mrveep.com/maxgenpost/index.php/welcome/apigetjobseeker?username=jagdisha&pwd=19081994"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        circleImageView=findViewById(R.id.profile_image)
        textView1=findViewById(R.id.text1)
        textView2=findViewById(R.id.text2)
        textView3=findViewById(R.id.text3)
        textView4=findViewById(R.id.text4)
        textView5=findViewById(R.id.text5)
        textView6=findViewById(R.id.text6)
        textView7=findViewById(R.id.text7)
        textView8=findViewById(R.id.text8)
        textView9=findViewById(R.id.text9)
        textView10=findViewById(R.id.text10)
        textView11=findViewById(R.id.text11)
        textView12=findViewById(R.id.text12)
        textView13=findViewById(R.id.text13)
        textView14=findViewById(R.id.text14)
        textView15=findViewById(R.id.text15)
        textView16=findViewById(R.id.text16)
        textView17=findViewById(R.id.text17)
        textView18=findViewById(R.id.text18)
        textView19=findViewById(R.id.text19)
        textView20=findViewById(R.id.text20)
        textView21=findViewById(R.id.text21)
        textView22=findViewById(R.id.text22)
        textView23=findViewById(R.id.text23)
        textView24=findViewById(R.id.text24)
        textView25=findViewById(R.id.text25)
        textView26=findViewById(R.id.text26)
        textView27=findViewById(R.id.text27)


        val stringRequest: StringRequest = object : StringRequest(Method.POST, url,
                Response.Listener { response ->
                    Log.e("respons>>>>>>",response)
                    Toast.makeText(this, response, Toast.LENGTH_LONG).show()
                    try {
                        val jsonObject:JSONObject= JSONObject(response)
                        val result:String=jsonObject.getString("result")
                        textView1.text=result
                        val msg:String=jsonObject.getString("msg")
                        textView2.text=msg
                        val jsonArray:JSONArray=jsonObject.getJSONArray("list")
                        val jsonObject1:JSONObject=jsonArray.getJSONObject(0)
                        val id:String=jsonObject1.getString("id")
                        textView3.text=id
                        val userregdate:String=jsonObject1.getString("userregdate")
                        textView4.text=userregdate
                        val dob:String=jsonObject1.getString("dob")
                        textView5.text=dob
                        val quali:String=jsonObject1.getString("quali")
                        textView6.text=quali
                        val special:String=jsonObject1.getString("special")
                        textView7.text=special
                        val gender:String=jsonObject1.getString("gender")
                        textView8.text=gender
                        val maritalstatus:String=jsonObject1.getString("maritalstatus")
                        textView9.text=maritalstatus
                        val comment:String=jsonObject1.getString("comment")
                        textView10.text=comment
                        val designation:String=jsonObject1.getString("designation")
                        textView11.text=designation
                        val industry:String=jsonObject1.getString("industry")
                        textView12.text=industry
                        val expsalary:String=jsonObject1.getString("expsalary")
                        textView13.text=expsalary
                        val username:String=jsonObject1.getString("username")
                        textView14.text=username
                        val exp:String=jsonObject1.getString("exp")
                        textView15.text=exp
                        val expdesc:String=jsonObject1.getString("expdesc")
                        textView16.text=expdesc
                        val lastemp:String=jsonObject1.getString("lastemp")
                        textView17.text=lastemp
                        val preferedlocation:String=jsonObject1.getString("preferedlocation")
                        textView18.text=preferedlocation
                        val filecv:String=jsonObject1.getString("filecv")
                        textView19.text=filecv
                        val firstname:String=jsonObject1.getString("firstname")
                        textView20.text=firstname
                        val lastname:String=jsonObject1.getString("lastname")
                        textView21.text=lastname
                        val useremail:String=jsonObject1.getString("useremail")
                        textView22.text=useremail
                        val phone:String=jsonObject1.getString("phone")
                        textView23.text=phone
                        val state:String=jsonObject1.getString("state")
                        textView24.text=state
                        val city:String=jsonObject1.getString("city")
                        textView25.text=city
                        val address:String=jsonObject1.getString("address")
                        textView26.text=address
                        val jobcat:String=jsonObject1.getString("jobcat")
                        textView27.text=jobcat

                        Glide.with(MainActivity.this)
                            .load(jsonObject1.getString(""))
                            .into()


                        //Parse your api responce here
                        /*val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)*/
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                Response.ErrorListener { error ->
                    Toast.makeText(this, error.toString(), Toast.LENGTH_LONG).show()
                }) {
            override fun getParams(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                //Change with your post params
                params["username"] = "jagdisha"
                params["pwd"] = "19081994"
                return params
            }
        }
        val requestQueue = Volley.newRequestQueue(this)
        requestQueue.add(stringRequest)
    }
}
