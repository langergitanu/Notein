package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Typeface f62969OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextView f62970OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f62971OooOoO0;

    public OooOo00(TextView textView, Typeface typeface, int i) {
        this.f62970OooOo0o = textView;
        this.f62969OooOo = typeface;
        this.f62971OooOoO0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f62970OooOo0o.setTypeface(this.f62969OooOo, this.f62971OooOoO0);
    }
}
