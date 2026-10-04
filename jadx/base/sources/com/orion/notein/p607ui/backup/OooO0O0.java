package com.orion.notein.p607ui.backup;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.os.BundleKt;
import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.p607ui.backup.OooO00o;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0o.C27351Oooo0O0;
import o0oOoOo.C31047OooOOoo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$manualBackup$2", m80623f = "CloudBackupViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2, StyleIdentifier.GRID_TABLE_3_ACCENT_2, 308, StyleIdentifier.GRID_TABLE_2_ACCENT_5, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, 315, StyleIdentifier.GRID_TABLE_3_ACCENT_6}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f70773OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BackupException f70774OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f70775OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.backup.OooO00o f70776OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$manualBackup$2$1", m80623f = "CloudBackupViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.backup.OooO00o f70777OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70778OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.backup.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f70777OooOo = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f70777OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70778OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.backup.OooO00o oooO00o = this.f70777OooOo;
                BackupEvent backupEvent = new BackupEvent(5, -999, null, 4, null);
                this.f70778OooOo0o = 1;
                C33781o00o0O c33781o00o0O = oooO00o.f70693OooOO0o;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, backupEvent);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(com.orion.notein.p607ui.backup.OooO00o oooO00o, String str, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f70776OooOoO0 = oooO00o;
        this.f70775OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f70776OooOoO0, this.f70775OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        if (com.orion.notein.p607ui.backup.OooO00o.OooO0oO(r5, (com.orion.notein.domain.models.backup.BackupException) r0, r18) != r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0197, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x002b, B:11:0x0033, B:42:0x00e6, B:12:0x0038, B:22:0x005d, B:26:0x007d, B:28:0x009d, B:30:0x00b0, B:31:0x00be, B:33:0x00c4, B:37:0x00d1, B:39:0x00d5, B:45:0x0101, B:46:0x012a, B:13:0x003c, B:19:0x0051, B:16:0x0043), top: B:60:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x002b, B:11:0x0033, B:42:0x00e6, B:12:0x0038, B:22:0x005d, B:26:0x007d, B:28:0x009d, B:30:0x00b0, B:31:0x00be, B:33:0x00c4, B:37:0x00d1, B:39:0x00d5, B:45:0x0101, B:46:0x012a, B:13:0x003c, B:19:0x0051, B:16:0x0043), top: B:60:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x002b, B:11:0x0033, B:42:0x00e6, B:12:0x0038, B:22:0x005d, B:26:0x007d, B:28:0x009d, B:30:0x00b0, B:31:0x00be, B:33:0x00c4, B:37:0x00d1, B:39:0x00d5, B:45:0x0101, B:46:0x012a, B:13:0x003c, B:19:0x0051, B:16:0x0043), top: B:60:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ConnectivityManager connectivityManager;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70773OooOo;
        String str = this.f70775OooOoO;
        com.orion.notein.p607ui.backup.OooO00o oooO00o = this.f70776OooOoO0;
        boolean z = true;
        C33781o00o0O c33781o00o0O = oooO00o.f70693OooOO0o;
        try {
        } catch (Exception e) {
            e = e;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudBackupViewModel");
            c20358OooO00o.OooO0Oo(e, "manualBackup error, manualBackupId: ".concat(str), new Object[0]);
            if (e instanceof BackupException) {
                BackupException backupException = (BackupException) e;
                BackupEvent backupEvent = new BackupEvent(5, backupException.getErrorCode(), BundleKt.bundleOf(new C32443OooOOO("note_title", backupException.getNoteTitle())));
                this.f70774OooOo0o = (BackupException) e;
                this.f70773OooOo = 5;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, backupEvent);
                if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                    this.f70774OooOo0o = null;
                    this.f70773OooOo = 6;
                }
            } else {
                BackupEvent backupEvent2 = new BackupEvent(5, -999, null, 4, null);
                this.f70773OooOo = 7;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, backupEvent2);
            }
            return enumC32485OooO00o;
        }
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = oooO00o.f70698OooOOo;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                this.f70773OooOo = 1;
                if (c33772OooooOo.emit(c32460OooOooO, this) != enumC32485OooO00o) {
                    this.f70773OooOo = 2;
                    if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                        Context context = oooO00o.f70686OooO0Oo;
                        OooOOO0.OooO0oO(context, "<this>");
                        Object systemService = context.getSystemService("connectivity");
                        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                        connectivityManager = (ConnectivityManager) systemService;
                        if (connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) == null) {
                            z = false;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("CloudBackupViewModel");
                        c20358OooO00o2.OooO0o0("manualBackup isNoNetworkConnected: " + z + ", manualBackupId: " + str, new Object[0]);
                        if (!z) {
                            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO00o);
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(oooO00o, null), 2);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        Iterator it = ((Iterable) oooO00o.f70701OooOo.f121747OooOo0o.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((C31047OooOOoo) next).f110852OooO0O0) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        C31047OooOOoo c31047OooOOoo = (C31047OooOOoo) next;
                        if (c31047OooOOoo == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("CloudBackupViewModel");
                            c20358OooO00o3.OooO0OO("manualBackup failed. No vendor in use, manualBackupId: " + str, new Object[0]);
                            throw new BackupException("Couldn't manually backup files, because there is no vendor in use.", -100, null, 4, null);
                        }
                        BackupFile.DiskVendor diskVendor = c31047OooOOoo.f110851OooO00o;
                        C27351Oooo0O0 c27351Oooo0O0 = oooO00o.f70688OooO0o0;
                        OooO00o.C23004OooO0Oo c23004OooO0Oo = oooO00o.f70713Oooo0;
                        this.f70773OooOo = 3;
                        if (c27351Oooo0O0.OooOOOo(diskVendor, null, c23004OooO0Oo, this) != enumC32485OooO00o) {
                            BackupEvent backupEvent3 = new BackupEvent(5, 0, null, 4, null);
                            this.f70773OooOo = 4;
                            c33781o00o0O.getClass();
                            c33781o00o0O.OooOO0(null, backupEvent3);
                            if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                this.f70773OooOo = 2;
                if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                C32446OooOOOo.OooO0O0(obj);
                Context context2 = oooO00o.f70686OooO0Oo;
                OooOOO0.OooO0oO(context2, "<this>");
                Object systemService2 = context2.getSystemService("connectivity");
                OooOOO0.OooO0o0(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
                connectivityManager = (ConnectivityManager) systemService2;
                if (connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) == null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("CloudBackupViewModel");
                c20358OooO00o22.OooO0o0("manualBackup isNoNetworkConnected: " + z + ", manualBackupId: " + str, new Object[0]);
                if (!z) {
                }
                break;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                BackupEvent backupEvent32 = new BackupEvent(5, 0, null, 4, null);
                this.f70773OooOo = 4;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, backupEvent32);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 5:
                e = this.f70774OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f70774OooOo0o = null;
                this.f70773OooOo = 6;
                break;
            case 6:
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
