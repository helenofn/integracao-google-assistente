package br.com.hfn.integracaogoogleassitente.google.api.v1.request;

import br.com.hfn.integracaogoogleassitente.google.api.v1.Context;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Device;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Handler;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Home;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Intent;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Scene;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Session;
import br.com.hfn.integracaogoogleassitente.google.api.v1.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GARequest {

	private Handler handler;
	private Intent intent;
	private Scene scene;
	private Session session;
	private User user;
	private Home home;
	private Device device;
	private Context context;
	
}
