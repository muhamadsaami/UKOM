 @extends('layout.layout')

@section('content')
<center>
<div class="span4">
<form class="control-group" method="post">
                          <input placeholder="Nama" class="input-xlarge" type="text" name="nama">
                          <div class="alert alert-danger"> 
                          {{ $errors->first('nama') }}
                          </div>

                          <input placeholder="Tanggal Main" class="input-xlarge" type="text" name="tglmain">
                           <div class="alert alert-danger"> 
                                {{ $errors->first('tglmain') }}</div>

                            <input placeholder="Jam Mulai" class="input-xlarge" type="text" name="mulai">
                           <div class="alert alert-danger"> 
                            {{ $errors->first('mulai') }}</div>
                          <input placeholder="Jam akhir" class="input-xlarge" type="text" name="berakhir">
                           <div class="alert alert-danger"> 
                                {{ $errors->first('berakhir') }}</div>
                                <input placeholder="No HP" class="input-xlarge" type="text" name="hp">
                           <div class="alert alert-danger"> 
                            {{ $errors->first('hp') }}</div>
                          <input placeholder="TYPE" class="input-xlarge" type="text" name="type">
                           <div class="alert alert-danger"> 
                            {{ $errors->first('type') }}</div>
                            <input placeholder="KOTA" class="input-xlarge" type="text" name="kota">
                           <div class="alert alert-danger"> 
                            {{ $errors->first('kota') }}</div>
                            <input placeholder="TEMPAT" class="input-xlarge" type="text" name="tempat">
                           <div class="alert alert-danger"> 
                            {{ $errors->first('tempat') }}</div>
                          <a href="{{URL::to('Booking/post')}}"><button class="btn btn-success btn-large btn-block">Tambah Data Booking</button></a>
                       </form><br>
                     </div>
                     </center>
                     
        <table class="table table-bordered table-hover">
     <thead>
       <tr>
      <th class="success">   No   </th>
      <th class="success">   Nama   </th>
       <th class="success">   Tanggal Main   </th>
       <th class="success">   Jam Mulai   </th>
       <th class="success">   Jam Akhir   </th>
       <th class="success">   HP   </th>
       <th class="success">   TYPE   </th>
       <th class="success">   KOTA   </th>
       <th class="success">   TEMPAT   </th>
       
      <th colspan="2" class="success">   Action   </th>
        </tr>
     </thead>
     <tbody>
    @foreach($data as $tampil)
    <tr>
        <td class="error">{{ $tampil->id  }}</td>
        <td class="error">{{ $tampil->nama  }}</td>
        <td class="error">{{ $tampil->tglmain  }}</td>
        <td class="warning">{{ $tampil->mulai  }}</td>
        <td class="warning">{{ $tampil->berakhir  }}</td>
        <td class="warning">{{ $tampil->hp  }}</td>
        <td class="warning">{{ $tampil->type  }}</td>
        <td class="warning">{{ $tampil->kota  }}</td>
        <td class="warning">{{ $tampil->tempat  }}</td>
        <td class="warning">{{ $tampil->password  }}</td>
        
      <td class="text-center">
        </td>
    </tr>
    @endforeach
  </tbody>
   </table>

                    @stop