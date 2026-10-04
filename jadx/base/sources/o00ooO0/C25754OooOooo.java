package o00ooO0;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;
import o00o0o00.C25438OooO00o;
import o00o0o0o.C25446OooO0Oo;
import o00o0o0o.C25451OooOO0;
import o00o0o0o.InterfaceC25445OooO0OO;

/* JADX INFO: renamed from: o00ooO0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25754OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25753OooOooO f87891OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOo f87892OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOO0 f87893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOo f87894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C25750OooOoOO f87895OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOo f87896OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C25451OooOO0 f87897OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C25745OooOo0 f87898OooO0oo;

    public C25754OooOooo(C25753OooOooO c25753OooOooO) {
        this.f87891OooO00o = c25753OooOooO;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OooOO0 OooO00o() {
        byte b;
        if (this.f87893OooO0OO == null) {
            C25753OooOooO c25753OooOooO = this.f87891OooO00o;
            String str = c25753OooOooO.f87881OooO;
            switch (str.hashCode()) {
                case -1868884870:
                    b = !str.equals("legacy_default_params") ? (byte) -1 : (byte) 3;
                    break;
                case -1106578487:
                    if (str.equals("legacy")) {
                        b = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (str.equals("experimental")) {
                        b = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (str.equals("dummy_with_tracking")) {
                        b = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (str.equals("dummy")) {
                        b = 0;
                        break;
                    }
                    break;
            }
            if (b == 0) {
                this.f87893OooO0OO = new C25742OooOOo();
            } else if (b == 1) {
                this.f87893OooO0OO = new C25744OooOOoo();
            } else if (b != 2) {
                C25751OooOoo c25751OooOoo = c25753OooOooO.f87883OooO0O0;
                C25446OooO0Oo c25446OooO0Oo = c25753OooOooO.f87885OooO0Oo;
                if (b != 3) {
                    this.f87893OooO0OO = new OooOOO(c25446OooO0Oo, c25753OooOooO.f87882OooO00o, c25751OooOoo);
                } else {
                    this.f87893OooO0OO = new OooOOO(c25446OooO0Oo, C25741OooOOOo.OooO00o(), c25751OooOoo);
                }
            } else {
                this.f87893OooO0OO = new C25746OooOo0O(c25753OooOooO.f87890OooOO0, C25751OooOoo.OooO0O0());
            }
        }
        return this.f87893OooO0OO;
    }

    public final C25750OooOoOO OooO0O0(int i) {
        OooOo oooOo;
        if (this.f87895OooO0o == null) {
            C25753OooOooO c25753OooOooO = this.f87891OooO00o;
            C25751OooOoo c25751OooOoo = c25753OooOooO.f87886OooO0o;
            Oooo000 oooo000 = c25753OooOooO.f87887OooO0o0;
            C25446OooO0Oo c25446OooO0Oo = c25753OooOooO.f87885OooO0Oo;
            if (i == 0) {
                if (this.f87896OooO0o0 == null) {
                    try {
                        this.f87896OooO0o0 = (OooOo) NativeMemoryChunkPool.class.getConstructor(InterfaceC25445OooO0OO.class, Oooo000.class, InterfaceC25755Oooo00O.class).newInstance(c25446OooO0Oo, oooo000, c25751OooOoo);
                    } catch (ClassNotFoundException e) {
                        C25438OooO00o.OooO0OO("PoolFactory", "", e);
                        this.f87896OooO0o0 = null;
                    } catch (IllegalAccessException e2) {
                        C25438OooO00o.OooO0OO("PoolFactory", "", e2);
                        this.f87896OooO0o0 = null;
                    } catch (InstantiationException e3) {
                        C25438OooO00o.OooO0OO("PoolFactory", "", e3);
                        this.f87896OooO0o0 = null;
                    } catch (NoSuchMethodException e4) {
                        C25438OooO00o.OooO0OO("PoolFactory", "", e4);
                        this.f87896OooO0o0 = null;
                    } catch (InvocationTargetException e5) {
                        C25438OooO00o.OooO0OO("PoolFactory", "", e5);
                        this.f87896OooO0o0 = null;
                    }
                }
                oooOo = this.f87896OooO0o0;
            } else if (i == 1) {
                if (this.f87894OooO0Oo == null) {
                    try {
                        this.f87894OooO0Oo = (OooOo) BufferMemoryChunkPool.class.getConstructor(InterfaceC25445OooO0OO.class, Oooo000.class, InterfaceC25755Oooo00O.class).newInstance(c25446OooO0Oo, oooo000, c25751OooOoo);
                    } catch (ClassNotFoundException unused) {
                        this.f87894OooO0Oo = null;
                    } catch (IllegalAccessException unused2) {
                        this.f87894OooO0Oo = null;
                    } catch (InstantiationException unused3) {
                        this.f87894OooO0Oo = null;
                    } catch (NoSuchMethodException unused4) {
                        this.f87894OooO0Oo = null;
                    } catch (InvocationTargetException unused5) {
                        this.f87894OooO0Oo = null;
                    }
                }
                oooOo = this.f87894OooO0Oo;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (this.f87892OooO0O0 == null) {
                    try {
                        this.f87892OooO0O0 = (OooOo) AshmemMemoryChunkPool.class.getConstructor(InterfaceC25445OooO0OO.class, Oooo000.class, InterfaceC25755Oooo00O.class).newInstance(c25446OooO0Oo, oooo000, c25751OooOoo);
                    } catch (ClassNotFoundException unused6) {
                        this.f87892OooO0O0 = null;
                    } catch (IllegalAccessException unused7) {
                        this.f87892OooO0O0 = null;
                    } catch (InstantiationException unused8) {
                        this.f87892OooO0O0 = null;
                    } catch (NoSuchMethodException unused9) {
                        this.f87892OooO0O0 = null;
                    } catch (InvocationTargetException unused10) {
                        this.f87892OooO0O0 = null;
                    }
                }
                oooOo = this.f87892OooO0O0;
            }
            OooOoo0.OooOo00.OooO0o0(oooOo, "failed to get pool for chunk type: " + i);
            this.f87895OooO0o = new C25750OooOoOO(oooOo, OooO0OO());
        }
        return this.f87895OooO0o;
    }

    public final C25451OooOO0 OooO0OO() {
        if (this.f87897OooO0oO == null) {
            if (this.f87898OooO0oo == null) {
                C25753OooOooO c25753OooOooO = this.f87891OooO00o;
                this.f87898OooO0oo = new C25745OooOo0(c25753OooOooO.f87885OooO0Oo, c25753OooOooO.f87888OooO0oO, c25753OooOooO.f87889OooO0oo);
            }
            this.f87897OooO0oO = new C25451OooOO0(this.f87898OooO0oo);
        }
        return this.f87897OooO0oO;
    }
}
