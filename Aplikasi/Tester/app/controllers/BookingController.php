<?php

class BookingController extends \BaseController {

	/**
	 * Display a listing of the resource.
	 *
	 * @return Response
	 */
	public function index()
	{
		$booking = Booking::All();
		return View::make("booking.databooking")->with("data",$booking);
	}


	/**
	 * Show the form for creating a new resource.
	 *
	 * @return Response
	 */
	public function create()
	{
		//
	}


	/**
	 * Store a newly created resource in storage.
	 *
	 * @return Response
	 */
	public function store()
	{
		$rules = array(
		'kota' => 'required',
        'tempat' => 'required',
        'nama' => 'required',
        'tglmain' => 'required',
        'mulai' => 'required',
        'berakhir' => 'required',
        'hp' => 'required',
        'type' => 'required',
        
        
        );
    
        $validation = Validator::make(Input::all(), $rules);
        if($validation->fails()) {
        return Redirect::back()->withInput()->withErrors($validation->messages());
        }
        else{
        $booking = new Booking;

		$booking->kota = Input::get('kota');
		$booking->tempat = Input::get('tempat');
		$booking->nama = Input::get('nama');
		$booking->tglmain = Input::get('tglmain');
		$booking->mulai = Input::get('mulai');
		$booking->berakhir = Input::get('berakhir');
		$booking->hp = Input::get('hp');
		$booking->type = Input::get('type');

		


		$booking->save();

		return Redirect::to('booking');
        }
	}


	/**
	 * Display the specified resource.
	 *
	 * @param  int  $id
	 * @return Response
	 */
	public function show($id)
	{
		//
	}


	/**
	 * Show the form for editing the specified resource.
	 *
	 * @param  int  $id
	 * @return Response
	 */
	public function edit($id)
	{
		//
	}


	/**
	 * Update the specified resource in storage.
	 *
	 * @param  int  $id
	 * @return Response
	 */
	public function update($id)
	{
		//
	}


	/**
	 * Remove the specified resource from storage.
	 *
	 * @param  int  $id
	 * @return Response
	 */
	public function destroy($id)
	{
		//
	}


}
