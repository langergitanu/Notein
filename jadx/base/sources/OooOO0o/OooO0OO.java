package OooOO0o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends ContextWrapper {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static Configuration f58322OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f58323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Resources.Theme f58324OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LayoutInflater f58325OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Configuration f58326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Resources f58327OooO0o0;

    public OooO0OO() {
        super(null);
    }

    public final void OooO00o(Configuration configuration) {
        if (this.f58327OooO0o0 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f58326OooO0Oo != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f58326OooO0Oo = new Configuration(configuration);
    }

    public final void OooO0O0() {
        if (this.f58324OooO0O0 == null) {
            this.f58324OooO0O0 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f58324OooO0O0.setTo(theme);
            }
        }
        this.f58324OooO0O0.applyStyle(this.f58323OooO00o, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f58327OooO0o0 == null) {
            Configuration configuration = this.f58326OooO0Oo;
            if (configuration == null) {
                this.f58327OooO0o0 = super.getResources();
            } else {
                if (f58322OooO0o == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f58322OooO0o = configuration2;
                }
                if (!configuration.equals(f58322OooO0o)) {
                    this.f58327OooO0o0 = createConfigurationContext(this.f58326OooO0Oo).getResources();
                }
            }
        }
        return this.f58327OooO0o0;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f58325OooO0OO == null) {
            this.f58325OooO0OO = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f58325OooO0OO;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f58324OooO0O0;
        if (theme != null) {
            return theme;
        }
        if (this.f58323OooO00o == 0) {
            this.f58323OooO00o = 2132017756;
        }
        OooO0O0();
        return this.f58324OooO0O0;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f58323OooO00o != i) {
            this.f58323OooO00o = i;
            OooO0O0();
        }
    }

    public OooO0OO(Context context, int i) {
        super(context);
        this.f58323OooO00o = i;
    }
}
