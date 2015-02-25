<?php

use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateBookingTable extends Migration {

	/**
	 * Run the migrations.
	 *
	 * @return void
	 */
	public function up()
	{
		 Schema::create('booking', function(Blueprint $table)
        {
                
               $table->increments('id');
               $table->string('nama', 255);
                $table->string('tglmain', 255);
               $table->string('mulai', 255);
               $table->string('berakhir', 255);
               $table->string('hp', 255);
               $table->string('type', 255);
               $table->string('kota', 255);
               $table->string('tempat', 255);
               $table->timestamps();
               
 
            });	
	}

	/**
	 * Reverse the migrations.
	 *
	 * @return void
	 */
	public function down()
	{
		Schema::drop("booking");
	}

}
