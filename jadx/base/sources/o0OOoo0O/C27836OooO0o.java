package o0OOoo0O;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o000OoO.C24536OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0OOo0o.C27538o00o0o0O;
import oO0O000.C32501OooO0oO;

/* JADX INFO: renamed from: o0OOoo0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27836OooO0o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Set<String> f98340OooO0o0 = oOo000Oo.OooOOO.OoooOo0(new String[]{"svg", "png", "webp", "jpg", "jpeg"});

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f98341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27538o00o0o0O f98342OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27321Oooo0o f98343OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f98344OooO0Oo;

    /* JADX INFO: renamed from: o0OOoo0O.OooO0o$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(((File) t).getName(), ((File) t2).getName());
        }
    }

    public C27836OooO0o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27538o00o0o0O stickerUseCase, InterfaceC27321Oooo0o stickerRepo, C27129OoooOOO c27129OoooOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerUseCase, "stickerUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerRepo, "stickerRepo");
        this.f98341OooO00o = abstractApplicationC26277OooOoOO;
        this.f98342OooO0O0 = stickerUseCase;
        this.f98343OooO0OO = stickerRepo;
        this.f98344OooO0Oo = c27129OoooOOO;
    }

    public static List OooO00o(File file) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.addAll(OooO00o(file2));
                } else {
                    String lowerCase = C32501OooO0oO.OooO0o0(file2).toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                    if (f98340OooO0o0.contains(lowerCase)) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        return oOo000Oo.OooOo.o00O0O(arrayList, new OooO00o());
    }
}
