package o0000o0O;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0000o0O.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC24295Oooooo extends FileObserver {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f81764OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final LinkedHashMap f81765OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC32507OooOO0o<String, C32460OooOooO>> f81766OooO00o;

    public FileObserverC24295Oooooo(String str) {
        super(str, 128);
        this.f81766OooO00o = new CopyOnWriteArrayList<>();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator<T> it = this.f81766OooO00o.iterator();
        while (it.hasNext()) {
            ((InterfaceC32507OooOO0o) it.next()).invoke(str);
        }
    }
}
