package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.Preconditions;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o000O0o.C24403OooO00o;
import o000O0o.C24405OooO0o0;
import o000O0o.C24406OooO0oO;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21529OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EditText f62919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24403OooO00o f62920OooO0O0;

    public C21529OooO0oo(EditText editText) {
        this.f62919OooO00o = editText;
        this.f62920OooO0O0 = new C24403OooO00o(editText);
    }

    public final KeyListener OooO00o(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.f62920OooO0O0.f82382OooO00o.getClass();
        if (keyListener instanceof C24405OooO0o0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C24405OooO0o0(keyListener);
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f62919OooO00o.getContext().obtainStyledAttributes(attributeSet, C20441OooO00o.f58278OooO, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            OooO0Oo(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final o000O0o.OooO0OO OooO0OO(InputConnection inputConnection, EditorInfo editorInfo) {
        C24403OooO00o c24403OooO00o = this.f62920OooO0O0;
        if (inputConnection == null) {
            c24403OooO00o.getClass();
            inputConnection = null;
        } else {
            C24403OooO00o.C19614OooO00o c19614OooO00o = c24403OooO00o.f82382OooO00o;
            c19614OooO00o.getClass();
            if (!(inputConnection instanceof o000O0o.OooO0OO)) {
                inputConnection = new o000O0o.OooO0OO(c19614OooO00o.f82383OooO00o, inputConnection, editorInfo);
            }
        }
        return (o000O0o.OooO0OO) inputConnection;
    }

    public final void OooO0Oo(boolean z) {
        C24406OooO0oO c24406OooO0oO = this.f62920OooO0O0.f82382OooO00o.f82384OooO0O0;
        if (c24406OooO0oO.f82403OooOoO0 != z) {
            if (c24406OooO0oO.f82401OooOo != null) {
                androidx.emoji2.text.OooO0OO oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
                C24406OooO0oO.OooO00o oooO00o = c24406OooO0oO.f82401OooOo;
                oooO0OOOooO00o.getClass();
                Preconditions.checkNotNull(oooO00o, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = oooO0OOOooO00o.f64708OooO00o;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    oooO0OOOooO00o.f64709OooO0O0.remove(oooO00o);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c24406OooO0oO.f82403OooOoO0 = z;
            if (z) {
                C24406OooO0oO.OooO00o(c24406OooO0oO.f82402OooOo0o, androidx.emoji2.text.OooO0OO.OooO00o().OooO0O0());
            }
        }
    }
}
