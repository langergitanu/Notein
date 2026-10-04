package o000O000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;

/* JADX INFO: renamed from: o000O000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24380OooO0o0 implements androidx.lifecycle.OooO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC21979OooOOo0 f82258OooOo0o;

    public C24380OooO0o0(EmojiCompatInitializer emojiCompatInitializer, AbstractC21979OooOOo0 abstractC21979OooOOo0) {
        this.f82258OooOo0o = abstractC21979OooOOo0;
    }

    @Override // androidx.lifecycle.OooO0o
    public final void OooOOoo(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        (Build.VERSION.SDK_INT >= 28 ? OooO0OO.OooO00o(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.OooO0OO(), 500L);
        this.f82258OooOo0o.OooO0OO(this);
    }
}
