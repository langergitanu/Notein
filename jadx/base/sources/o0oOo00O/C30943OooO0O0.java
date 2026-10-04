package o0oOo00O;

import com.huawei.hms.network.embedded.C18250l0;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0o.C27368Ooooo0o;
import o0OOo0o.C27596o00ooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOo00O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.storage.StorageOptimizationViewModel$clearExportCaches$1", m80623f = "StorageOptimizationViewModel.kt", m80624l = {36}, m80625m = "invokeSuspend")
public final class C30943OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30945OooO0Oo f110589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110590OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30943OooO0O0(C30945OooO0Oo c30945OooO0Oo, Continuation<? super C30943OooO0O0> continuation) {
        super(2, continuation);
        this.f110589OooOo = c30945OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30943OooO0O0(this.f110589OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30943OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C32460OooOooO c32460OooOooO;
        File file;
        File[] fileArr;
        long j;
        Long lOooOOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110590OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30945OooO0Oo c30945OooO0Oo = this.f110589OooOo;
            this.f110590OooOo0o = 1;
            try {
                file = new File(c30945OooO0Oo.f110593OooO0Oo.f96562OooO0o.f96913OooO0OO.getFilesDir(), "exports");
            } catch (Exception e) {
                C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Error during export cache cleanup", new Object[0]);
            }
            if (file.exists()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = jCurrentTimeMillis - C18250l0.g.f55493g;
                File[] fileArrListFiles = file.listFiles(new C27368Ooooo0o());
                if (fileArrListFiles == null) {
                    c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } else {
                    int length = fileArrListFiles.length;
                    long j3 = 0;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < length) {
                        File file2 = fileArrListFiles[i2];
                        try {
                            String name = file2.getName();
                            OooOOO0.OooO0Oo(name);
                            lOooOOO = C33596OooOOo0.OooOOO(name);
                        } catch (Exception e2) {
                            e = e2;
                            fileArr = fileArrListFiles;
                        }
                        if (lOooOOO == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            String name2 = file2.getName();
                            StringBuilder sb = new StringBuilder();
                            fileArr = fileArrListFiles;
                            try {
                                sb.append("Invalid directory name format: ");
                                sb.append(name2);
                                c20358OooO00o.OooOO0O(sb.toString(), new Object[0]);
                            } catch (Exception e3) {
                                e = e3;
                                j = jCurrentTimeMillis;
                                C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Error processing cache dir: " + file2.getName(), new Object[0]);
                            }
                        } else {
                            fileArr = fileArrListFiles;
                            if (lOooOOO.longValue() < j2) {
                                long jLongValue = (jCurrentTimeMillis - lOooOOO.longValue()) / ((long) 60000);
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                j = jCurrentTimeMillis;
                                try {
                                    c20358OooO00o2.OooO00o("Cleaning expired cache dir: " + file2.getName() + ", age: " + jLongValue + "min", new Object[0]);
                                    long jOooO00o = C27596o00ooo.OooO00o(file2);
                                    int iOooO0O0 = C27596o00ooo.OooO0O0(file2);
                                    if (C32501OooO0oO.OooO0Oo(file2)) {
                                        i3++;
                                        i4 += iOooO0O0;
                                        j3 += jOooO00o;
                                        c20358OooO00o2.OooO00o("Deleted cache dir: " + file2.getName(), new Object[0]);
                                    } else {
                                        c20358OooO00o2.OooO0OO("Failed to delete cache dir: " + file2.getName(), new Object[0]);
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Error processing cache dir: " + file2.getName(), new Object[0]);
                                }
                            }
                            i2++;
                            fileArrListFiles = fileArr;
                            jCurrentTimeMillis = j;
                        }
                        j = jCurrentTimeMillis;
                        i2++;
                        fileArrListFiles = fileArr;
                        jCurrentTimeMillis = j;
                    }
                    C34406OooO00o.f123390OooO00o.OooO0o0("Cache cleanup completed: deleted " + i3 + " dirs, " + i4 + " files, freed " + (j3 / ((long) 1024)) + "KB", new Object[0]);
                    c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
            } else {
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            if (c32460OooOooO != EnumC32485OooO00o.f116726OooOo0o) {
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            if (c32460OooOooO == enumC32485OooO00o) {
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
