package com.example.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.imageview.ShapeableImageView;

@SuppressWarnings("ALL")
public class CoffeeDetails extends AppCompatActivity {

	ShapeableImageView mainimage, attr1img, attr2img, food1img, food2img;
	TextView city, description, duration, timetovisit, attr1name, attr1des, attr2name, attr2des, food1name, food1des, food2name, food2des, lokasi, rating, pricerange, category;
	Button locationbtn;
	String location;

  @SuppressWarnings("Convert2Lambda")
  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_coffee_details);

    mainimage = findViewById(R.id.citydetails_image);
    attr1img = findViewById(R.id.citydetails_place1image);
    attr2img = findViewById(R.id.citydetails_place2image);
    food1img = findViewById(R.id.citydetails_food1image);
    food2img = findViewById(R.id.citydetails_food2image);
    city = findViewById(R.id.citydetails_name);
    description = findViewById(R.id.citydetails_description);
    duration = findViewById(R.id.citydetails_tripduration);
    timetovisit = findViewById(R.id.citydetails_besttime);
    attr1name = findViewById(R.id.citydetails_place1name);
    attr2name = findViewById(R.id.citydetails_place2name);
    food1name = findViewById(R.id.citydetails_food1name);
    food2name = findViewById(R.id.citydetails_food2name);
    attr1des = findViewById(R.id.citydetails_place1description);
    attr2des = findViewById(R.id.citydetails_place2description);
    food1des = findViewById(R.id.citydetails_food1description);
    food2des = findViewById(R.id.citydetails_food2description);
    locationbtn = findViewById(R.id.citydetails_getlocationbtn);
    lokasi = findViewById(R.id.lokasi);
    rating = findViewById(R.id.rating);

    String city_str = getIntent().getStringExtra("putextra_city");

    if (city_str.equals("Roemah Pohon")) {
      city.setText("Roemah Pohon");
      lokasi.setText("Batu Besar");
      attr1name.setText("Sun Moffie");
      attr2name.setText("Roemah Pohon");
      attr1des.setText("Nongsa");
      attr2des.setText("Roemah Pohon is a historical building");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Rice Bowl");
      food2name.setText("Bhalla");
      food1des.setText("as");
      food2des.setText("A popular street food");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText("Tempat Bernuansa Alam");
      location =
          "https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1665840580121!5m2!1sen!2sid";
      timetovisit.setText("October to Mwarch");
      duration.setText("Location");
      mainimage.setImageResource(R.drawable.roemah_pohon);
      rating.setText("Rating \n9.0(250 Reviews)");
    }
    if (city_str.equals("Cetro")) {
      city.setText("Cetro");
      attr1name.setText("Golden Temple");
      attr2name.setText("Jallianwala Bagh");
      attr1des.setText("Shri Harmandir Sahib, a very popular temple.");
      attr2des.setText("Jallianwala Bagh is a historic garden.");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Aloo Paratha");
      food2name.setText("Sarson ka Saag");
      food1des.setText("Tasty dish with lot of butter.");
      food2des.setText("A very popular dish mainly eaten with makke ki roti");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
          "A very popular city among tourists. Famous attractions of , Wagah Border etc.");
      location =
          "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("November to March");
      duration.setText("2 Days");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText(" ");
      lokasi.setText("Batam Center, Batam Kota");
    }
    if (city_str.equals("Kasta")) {
      city.setText("Amritsar, Punjab");
      attr1name.setText("Golden Temple");
      attr2name.setText("Jallianwala Bagh");
      attr1des.setText("Shri Harmandir Sahib, a very popular temple.");
      attr2des.setText("Jallianwala Bagh is a historic garden.");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Aloo Paratha");
      food2name.setText("Sarson ka Saag");
      food1des.setText("Tasty dish with lot of butter.");
      food2des.setText("A very popular dish mainly eaten with makke ki roti");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
          "A very popular city among tourists. Famous attractions of amritsar are Golden Temple, Wagah Border etc.");
      location =
          "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("November to March");
      duration.setText("2 Days");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.4 (286 Reviews");
      rating.setText("gawat terkeren");
    }

    if (city_str.equals("Lintas")) {
      city.setText("Lintas");
      attr1name.setText("dasdas");
      attr2name.setText("asdas");
      attr1des.setText("asdasda.");
      attr2des.setText("sdasdasdn.");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("asdas");
      food2name.setText("sadas");
      food1des.setText("Tsdssd.");
      food2des.setText("A very popular dish mainly eaten with makke ki roti");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "A very popular city among tourists. Famous attractions of amritsar are Golden Temple, Wagah Border etc.");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("November to March");
      duration.setText("2 Days");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.4 (286 Reviews");
      rating.setText("gawat terkeren");
    }

    if (city_str.equals("Luar Garis")) {
      city.setText("Luar Garis");
      lokasi.setText("Batam Kota");
      attr1name.setText("Cetroo Coffee");
      attr2name.setText("Lintas Coffee");
      attr1des.setText("Batam Kota");
      attr2des.setText("Batam Kota");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("----");
      food2name.setText("----");
      food1des.setText("----");
      food2des.setText("----");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "Coffee Shop yang berisikan hidangan ");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("4PM to 11PM");
      duration.setText("Location");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.7 (134 Reviews");
    }

    if (city_str.equals("SUNMOFFEE")) {
      city.setText("SUNMOFFEE");
      attr1name.setText("dasdas");
      attr2name.setText("asdas");
      attr1des.setText("asdasda.");
      attr2des.setText("sdasdasdn.");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("asdas");
      food2name.setText("sadas");
      food1des.setText("Tsdssd.");
      food2des.setText("A very popular dish mainly eaten with makke ki roti");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "A very popular city among tourists. Famous attractions of amritsar are Golden Temple, Wagah Border etc.");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("November to March");
      duration.setText("2 Days");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.4 (286 Reviews");
      rating.setText("gawat terkeren");
    }
      if (city_str.equals("SUNMOFFEE")) {
      city.setText("SUNMOFFEE");
      attr1name.setText("dasdas");
      attr2name.setText("asdas");
      attr1des.setText("asdasda.");
      attr2des.setText("sdasdasdn.");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("asdas");
      food2name.setText("sadas");
      food1des.setText("Tsdssd.");
      food2des.setText("A very popular dish mainly eaten with makke ki roti");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "A very popular city among tourists. Famous attractions of amritsar are Golden Temple, Wagah Border etc.");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("November to March");
      duration.setText("2 Days");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.4 (286 Reviews");
      rating.setText("gawat terkeren");
    }
      


    locationbtn.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
          }
        });
}
}



