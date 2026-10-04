package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ListFragment extends Fragment {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ListView f64893OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f64895OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f64896OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f64897OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f64898OooOooO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Handler f64892OooOo0o = new Handler();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f64891OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0O0 f64894OooOoO0 = new OooO0O0();

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = ListFragment.this.f64893OooOoO;
            listView.focusableViewAvailable(listView);
        }
    }

    public class OooO0O0 implements AdapterView.OnItemClickListener {
        public OooO0O0() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListFragment.this.getClass();
        }
    }

    public final void OooOoO0() {
        if (this.f64893OooOoO != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f64893OooOoO = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f64895OooOoOO = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f64897OooOoo0 = view.findViewById(16711682);
            this.f64896OooOoo = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f64893OooOoO = listView;
            View view2 = this.f64895OooOoOO;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f64898OooOooO = true;
        this.f64893OooOoO.setOnItemClickListener(this.f64894OooOoO0);
        if (this.f64897OooOoo0 != null) {
            OooOoO0();
            View view3 = this.f64897OooOoo0;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.f64898OooOooO) {
                this.f64898OooOooO = false;
                view3.clearAnimation();
                this.f64896OooOoo.clearAnimation();
                this.f64897OooOoo0.setVisibility(0);
                this.f64896OooOoo.setVisibility(8);
            }
        }
        this.f64892OooOo0o.post(this.f64891OooOo);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f64892OooOo0o.removeCallbacks(this.f64891OooOo);
        this.f64893OooOoO = null;
        this.f64898OooOooO = false;
        this.f64896OooOoo = null;
        this.f64897OooOoo0 = null;
        this.f64895OooOoOO = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OooOoO0();
    }
}
