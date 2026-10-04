package com.orion.notein.data.repo.transactions;

import Oooo0oO.C21023OooO0Oo;
import com.android.billingclient.api.C22165OooOOOo;
import com.aspose.slides.C22226Oooo0oo;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.ShapeInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0OoO0oo.C28687OooO0OO;
import o0oo0o.InterfaceC31284OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22926OooO0oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f70076OooOo0o;

    public /* synthetic */ C22926OooO0oo(int i) {
        this.f70076OooOo0o = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        List<InterfaceC31284OooO0O0> list;
        Iterator<T> it;
        int i;
        switch (this.f70076OooOo0o) {
            case 0:
                C22165OooOOOo c22165OooOOOo = (C22165OooOOOo) obj;
                return C21023OooO0Oo.OooO0OO(")", c22165OooOOOo.f66985OooO0Oo, C22226Oooo0oo.OooO0OO(c22165OooOOOo.f66983OooO0O0, "("));
            default:
                DrawResult result = (DrawResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                List<InterfaceC31284OooO0O0> newItemList = result.getNewItemList();
                List<InterfaceC31284OooO0O0> removeItemList = result.getRemoveItemList();
                if (newItemList.isEmpty() || newItemList.size() != removeItemList.size()) {
                    z = false;
                } else {
                    List<InterfaceC31284OooO0O0> list2 = newItemList;
                    boolean z2 = list2 instanceof Collection;
                    List<InterfaceC32507OooOO0o<DrawResult, Boolean>> list3 = C28687OooO0OO.f101643OooO00o;
                    if (z2 && list2.isEmpty()) {
                        list = removeItemList;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            if (z2) {
                            }
                        }
                    } else {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!C28687OooO0OO.OooO00o((InterfaceC31284OooO0O0) it2.next())) {
                                z = false;
                            }
                        }
                        list = removeItemList;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (!C28687OooO0OO.OooO00o((InterfaceC31284OooO0O0) it.next())) {
                                    z = false;
                                }
                            }
                            if (z2 && list2.isEmpty()) {
                                i = 0;
                            } else {
                                i = 0;
                                for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list2) {
                                    if ((interfaceC31284OooO0O0 instanceof DrawRecord ? ((DrawRecord) interfaceC31284OooO0O0).isTapeTransparent() : interfaceC31284OooO0O0 instanceof ShapeInfo ? ((ShapeInfo) interfaceC31284OooO0O0).isTapeTransparent() : false) && (i = i + 1) < 0) {
                                        C34429OooOOo0.OooOOo0();
                                        throw null;
                                    }
                                }
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("AutoAddPageStrategies");
                            c20358OooO00o.OooO00o("[toggle] start: newTransparent=%d，newItems.size=%d", Integer.valueOf(i), Integer.valueOf(newItemList.size()));
                            if (i != newItemList.size() || i == 0) {
                                z = true;
                            }
                        } else if (z2) {
                            i = 0;
                            while (r9.hasNext()) {
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("AutoAddPageStrategies");
                            c20358OooO00o2.OooO00o("[toggle] start: newTransparent=%d，newItems.size=%d", Integer.valueOf(i), Integer.valueOf(newItemList.size()));
                            if (i != newItemList.size()) {
                            }
                            z = true;
                        }
                    }
                }
                if (z) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("AutoAddPageStrategies");
                    c20358OooO00o3.OooO0o0("Tape transparent toggle detected, skipping auto add page", new Object[0]);
                }
                return Boolean.valueOf(!z);
        }
    }
}
