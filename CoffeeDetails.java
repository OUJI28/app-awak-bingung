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
	TextView city, description, duration, timetovisit, attr1name, attr1des, attr2name, attr2des, food1name, food1des, food2name, food2des, lokasi, rating;
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
      rating.setText("");
    }

    if (city_str.equals("Cetro")) {
      city.setText("Cetro");
      lokasi.setText("Batam Kota");
      attr1name.setText("Lintas Coffee");
      attr2name.setText("Inspector Coffee");
      attr1des.setText("Batam Kota");
      attr2des.setText("Batam Kota");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Ice Cream Boba");
      food2name.setText("Avogato");
      food1des.setText("Ice Cream filled with boba");
      food2des.setText("Avocado Juice with Chocolate Ice Cream on top");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
          "Cetroo Coffe yang bertempat di ruko WTB merupakan salah satu tempat nongkrong dan berkumpul yang sangat direkomendasikan karena letak nya yang strategis dan berletak ditengah kota yang menjadikan nya salah satu destinasi tujuan tempat nongkrong dikalangan anak muda");
      location =
          "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("4PM to 12PM");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("\n4.5 (268 Reviews) ");
      lokasi.setText("Batam Center, Batam Kota");
    }

    if (city_str.equals("Kasta")) {
      city.setText("Kasta Coffee");
      lokasi.setText("Batam Kota");
      attr1name.setText("Level Up");
      attr2name.setText("Suaka Coffee");
      attr1des.setText("Bengkong");
      attr2des.setText("Bengkong");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Ricebowl Chicken Mentai");
      food2name.setText("Affogato");
      food1des.setText("Popular Ricebowl");
      food2des.setText("Gelato yang dilumuri Espresso");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
          "Daya tarik yang dimiliki Kasta Coffee Shop Batam yang pertama yaitu tempat nongkrong tersebut memiliki tempat yang nyaman untuk bersantai sambil menikmati senja maupun ngobrol santai bersama teman – teman, keluarga hingga pasangan Anda. Di kasta juga memudahkan anda dalam berkonsentrasi dalam mengerjakan tugas2 dan bekerja disini juga ini juga memiliki dua area yaitu terdapat area indoor dan juga outdoor.
          ");
      location =
          "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("3PM to 12AM");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.4 (291 Reviews");
    }

    if (city_str.equals("Lintas")) {
      city.setText("Lintas Coffee");
      lokasi.setText("Batam Kota");
      attr1name.setText("Cetroo Coffee");
      attr2name.setText("Kopi Atok");
      attr1des.setText("Batam Kota");
      attr2des.setText("Batam Kota");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Mocktail Coffee and Mojito");
      food2name.setText("Beef Black Paper.");
      food1des.setText("Virgin soda based,mint and fruit extraction");
      food2des.setText("Beef strips with a black pepper flavored sauce");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "Lintas Coffee memiliki lokasi yang strategis dan nyaman untuk hangout, mengerjakan tugas, hingga bekerja. Dikarenakan memiliki lokasi yang dekat persimpangan jalan dan dekat dengan daerah perkuliahan, maka sangat direkomendasikan untuk berkunjung ke Lintas Coffee
              ");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("3PM to 12AM");
      duration.setText("2 Days");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.7 (109 Reviews");
    }

    if (city_str.equals("Amati")) {
      city.setText("AMATI COFFEE");
      lokasi.setText("Batu Aji");
      attr1name.setText("Bergaris");
      attr2name.setText("Runa");
      attr1des.setText("Batu Aji");
      attr2des.setText("Batu Aji");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Cheesy Crispy Chicken Leg");
      food2name.setText("Es Kopi Aren");
      food1des.setText("Paha Ayam yang dilumuri saus keju");
      food2des.setText("Rasa Aren yang tidak sering dijumpai");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "Coffee Shop yang cocok untuk hangout bareng teman karena,Amati Coffee memiliki 2 area (Indoor dan Outdoor), keduanya juga menyuguhkan suasana yang menarik sehingga pengunjung akan merasa semakin betah dan nyaman");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("4PM to 12AM");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.5 (608 Reviews");
    }

    if (city_str.equals("LevelUp")) {
      city.setText("Level Up Coffee and Floating Bar");
      lokasi.setText("Bengkong");
      attr1name.setText("Kasta Coffee");
      attr2name.setText("Suaka");
      attr1des.setText("Bengkong");
      attr2des.setText("Bengkong");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Spaghetti Chicken Blackpapper");
      food2name.setText("Rice Bowl Chicken Sambal Ijo");
      food1des.setText("Varian rasa Spaghetti yang dipadu dengan lada hitam");
      food2des.setText("Menu ricebowl dengan topping menarik");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "Level Up coffe merupakan cafe yang menyediakan view laut yang disertai tempat nongkrong diatas air dan memanjakan mata dengan menu makanan dan minuman yang siap memanjakan lidah. Level up coffe juga menawarkan suasana alam dengan rindang pepohonan dan juga pinggiran danau yang membuat suasana santai dan relax.
              ");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("4PM to 12AM");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.5 (349 Reviews");
    }

    if (city_str.equals("Underground")) {
      city.setText("UNDERGROUND COFFEE BATAM");
      lokasi.setText("Sagulung");
      attr1name.setText("Amati Coffee");
      attr2name.setText("Arkana");
      attr1des.setText("Tembesi");
      attr2des.setText("Batu Aji");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Mojito");
      food2name.setText("Mochaccino");
      food1des.setText("A lot of mojito's variants");
      food2des.setText("Better than the other moccachinos");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "Underground Cafe merupakan Cafe yang menarik di Pulau Batam dikarenakan tempat yang nyaman untuk hangout sekaligus pemandangan laut batam  biru memberikan kesan  berbeda bagi pengunjung yang berkunjung ke cafe ini.
              Cafe ini terletak sebelum jembatan 1 dan hotel harris dan juga jelas pemandangan dari arah cafe ini sangat mengagumkan ketika di sore hari ketika sunrise yang indah membuat penikmat senja sangat cocok untuk hangout di cafe ini
              ");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("4PM to 12AM");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.5 (218 Reviews");
    }

    if (city_str.equals("Sunmofee")) {
      city.setText("Sunmofee Tropical");
      lokasi.setText("Nongsa");
      attr1name.setText("Roemah Pohon");
      attr2name.setText("Cetroo Coffee");
      attr1des.setText("Nongsa");
      attr2des.setText("Batam Kota");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("Tropical Drinks");
      food2name.setText("Bakso");
      food1des.setText("Minuman yang cocok untuk menemani senja");
      food2des.setText("Jenis makanan yang jarang ditemui di Cafe");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "Sunmofee mengarah ke arah  matahari terbenam yang membuat cafe ini memiliki ciri yang bernuansa menyatu dengan alam dengan tempat yang outdoor sambil santai menikmati sunset di sore hari dan pemandangan laut nongsa yg indah ");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("3PM to 12AM");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4.5 (96 Reviews");
    }

    if (city_str.equals("")) {
      city.setText("");
      lokasi.setText("");
      attr1name.setText("");
      attr2name.setText("");
      attr1des.setText(".");
      attr2des.setText(".");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("");
      food2name.setText("");
      food1des.setText("");
      food2des.setText("");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4. ( Reviews");
    }

    if (city_str.equals("")) {
      city.setText("");
      lokasi.setText("");
      attr1name.setText("");
      attr2name.setText("");
      attr1des.setText(".");
      attr2des.setText(".");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("");
      food2name.setText("");
      food1des.setText("");
      food2des.setText("");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4. ( Reviews");
    }

    if (city_str.equals("")) {
      city.setText("");
      lokasi.setText("");
      attr1name.setText("");
      attr2name.setText("");
      attr1des.setText(".");
      attr2des.setText(".");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("");
      food2name.setText("");
      food1des.setText("");
      food2des.setText("");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4. ( Reviews");
    }

    if (city_str.equals("")) {
      city.setText("");
      lokasi.setText("");
      attr1name.setText("");
      attr2name.setText("");
      attr1des.setText(".");
      attr2des.setText(".");
      attr1img.setImageResource(R.drawable.amatipng);
      attr2img.setImageResource(R.drawable.amatipng);
      food1name.setText("");
      food2name.setText("");
      food1des.setText("");
      food2des.setText("");
      food1img.setImageResource(R.drawable.amatipng);
      food2img.setImageResource(R.drawable.amatipng);
      description.setText(
              "");
      location =
              "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.045089018658!2d104.1284838!3d1.1524394!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x73ab5d93ef9c57fe!2sRoemah%20Pohon!5e0!3m2!1sen!2sid!4v1661404167976!5m2!1sen!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
      timetovisit.setText("");
      duration.setText("----");
      mainimage.setImageResource(R.drawable.amatipng);
      rating.setText("Rating \n4. ( Reviews");
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



