package ru.glim.amynet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class SearchAbleActivity extends AppCompatActivity {

  private static final String TAG = "SearchAbleActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_able);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.search_menu, menu);
    SearchView searchView = (SearchView) menu.getItem(0).getActionView();
    searchView.setIconified(false);
    searchView.focusSearch(View.FOCUS_LEFT);
    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
      @Override
      public boolean onQueryTextSubmit(String query) {
        return false;
      }

      @Override
      public boolean onQueryTextChange(String newText) {
        Log.d(TAG, "onQueryTextChange: ".concat(newText));
        return true;
      }
    });
    return super.onCreateOptionsMenu(menu);
  }
}
