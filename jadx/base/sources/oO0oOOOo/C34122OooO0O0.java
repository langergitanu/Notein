package oO0oOOOo;

import com.orion.notein.domain.models.cloud.NoteInDriveError;
import java.util.concurrent.ConcurrentHashMap;
import oO00OoO0.C32286OooO0oO;
import oO00OoO0.InterfaceC32282OooO0O0;
import oO00OoOO.C32289OooO0O0;
import oO0oOOOo.InterfaceC34127OooO0oO;

/* JADX INFO: renamed from: oO0oOOOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34122OooO0O0<T extends InterfaceC34127OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32282OooO0O0 f122628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32289OooO0O0 f122629OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34123OooO0OO f122630OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentHashMap f122631OooO0Oo = new ConcurrentHashMap();

    public C34122OooO0O0(InterfaceC32282OooO0O0 interfaceC32282OooO0O0, C32289OooO0O0 c32289OooO0O0, C34123OooO0OO c34123OooO0OO) {
        this.f122628OooO00o = interfaceC32282OooO0O0;
        this.f122629OooO0O0 = c32289OooO0O0;
        this.f122630OooO0OO = c34123OooO0OO;
    }

    public final T OooO00o(String str) {
        if (!this.f122631OooO0Oo.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f122631OooO0Oo.containsKey(str)) {
                        try {
                            for (C32286OooO0oO c32286OooO0oO : this.f122629OooO0O0.OooO00o(this.f122628OooO00o.OooO00o(str))) {
                                C34123OooO0OO c34123OooO0OO = this.f122630OooO0OO;
                                C34125OooO0o<String> c34125OooO0o = c34123OooO0OO.f122633OooO0O0;
                                if (c34125OooO0o.f122635OooO0O0.OooO00o(c32286OooO0oO).equals(NoteInDriveError.ERROR_RESOURCE_NOT_EXIST)) {
                                    c34123OooO0OO.f122632OooO00o.OooO00o(c32286OooO0oO);
                                } else {
                                    c34125OooO0o.OooO00o(c32286OooO0oO);
                                }
                            }
                            this.f122631OooO0Oo.put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file " + str, e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f122630OooO0OO;
    }
}
