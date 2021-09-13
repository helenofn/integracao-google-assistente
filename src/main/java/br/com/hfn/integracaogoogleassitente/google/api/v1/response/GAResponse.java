package br.com.hfn.integracaogoogleassitente.google.api.v1.response;

import br.com.hfn.integracaogoogleassitente.google.api.v1.Device;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Expected;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Home;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Prompt;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Scene;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Session;
import br.com.hfn.integracaogoogleassitente.google.api.v1.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GAResponse {

	private Prompt prompt;
	private Scene scene;
	private Session session;
	private User user;
	private Home home;
	private Device device;
	private Expected expected; 
}
