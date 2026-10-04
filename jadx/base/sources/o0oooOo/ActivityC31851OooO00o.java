package o0oooOo;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0oooOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC31851OooO00o extends AbstractActivityC31852OooO0O0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f113516OooOooo = 0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ProgressBar f113517OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public MenuItem f113518OooOooO;

    /* JADX INFO: renamed from: o0oooOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public class ViewOnClickListenerC20181OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ WebView f113520OooOo0o;

        public ViewOnClickListenerC20181OooO00o(WebView webView) {
            this.f113520OooOo0o = webView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebView webView = this.f113520OooOo0o;
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                int i = ActivityC31851OooO00o.f113516OooOooo;
                ActivityC31851OooO00o.this.OooO0O0(0, null);
            }
        }
    }

    /* JADX INFO: renamed from: o0oooOo.OooO00o$OooO0O0 */
    public class OooO0O0 implements MenuItem.OnMenuItemClickListener {
        public OooO0O0() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            ActivityC31851OooO00o.this.OooO00o(true);
            return true;
        }
    }

    public ActivityC31851OooO00o() {
        this.f113525OooOoO = false;
    }

    @Override // o0oooOo.AbstractActivityC31852OooO0O0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        WebView webView = this.f113524OooOo0o;
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayOptions(16);
            actionBar.setCustomView(R.layout.actionbar_custom);
            ((ImageView) actionBar.getCustomView().findViewById(R.id.back_iv)).setOnClickListener(new ViewOnClickListenerC20181OooO00o(webView));
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
        this.f113517OooOoo = progressBar;
        relativeLayout.addView(progressBar, new ViewGroup.LayoutParams(-1, -2));
        setContentView(relativeLayout);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!isFinishing()) {
            MenuItem menuItemAdd = menu.add("refresh");
            this.f113518OooOooO = menuItemAdd;
            menuItemAdd.setIcon(android.R.drawable.stat_notify_sync_noanim);
            this.f113518OooOooO.setShowAsActionFlags(2);
            this.f113518OooOooO.setOnMenuItemClickListener(new OooO0O0());
            this.f113518OooOooO.setVisible(false);
        }
        return true;
    }
}
