package fragmenti;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.borcha.hollywood.R;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class FragmentDetalji extends Fragment {

    View vi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vi=inflater.inflate(R.layout.activity_main,null);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
