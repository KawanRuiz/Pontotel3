package br.com.pontotel.aplicativo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class InformacoesActivity extends Activity {

	private TextView txtId;
	private TextView txtName;
	private TextView txtPwd;
	private Pessoa pessoa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consumir_json);

	//	pessoa = (Pessoa) getIntent().getSerializableExtra("pessoa");

		txtId = (TextView) findViewById(R.id.txtId);
		txtName = (TextView) findViewById(R.id.txtName);
		txtPwd = (TextView) findViewById(R.id.txtPwd);

		txtId.setText(pessoa.getId());
		txtName.setText(pessoa.getName());
		txtPwd.setText(pessoa.getPwd());
	}

}
