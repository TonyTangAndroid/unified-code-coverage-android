package net.rafaeltoledo.coverage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private TextView text;
  private PojoMissed pojoMissed;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.button).setOnClickListener(this);
    findViewById(R.id.hide).setOnClickListener(this);
    text = findViewById(R.id.text);
  }

  @Override
  public void onClick(View v) {
    if (v.getId() == R.id.button) {
      text.setText("Hello World!");
    } else {
      pojoMissed = new PojoMissed();
      text.setText(pojoMissed.getThing());
      v.setVisibility(View.GONE);
    }
  }
}
