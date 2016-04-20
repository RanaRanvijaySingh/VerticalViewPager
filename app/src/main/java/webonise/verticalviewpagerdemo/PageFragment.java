package webonise.verticalviewpagerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_page,null);
        final TextView tvPageCount = (TextView) view.findViewById(R.id.tvPageCount);
        tvPageCount.setText(getArguments().getString("pageCount"));
        return view;
    }
}
