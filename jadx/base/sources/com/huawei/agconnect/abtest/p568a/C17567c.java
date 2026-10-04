package com.huawei.agconnect.abtest.p568a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.abtest.ABTestException;
import com.huawei.agconnect.abtest.AGConnectABTesting;
import com.huawei.agconnect.common.api.HaBridge;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.agconnect.abtest.a.c */
/* JADX INFO: loaded from: classes8.dex */
public class C17567c extends AGConnectABTesting {

    /* JADX INFO: renamed from: a */
    private final String f51970a;

    /* JADX INFO: renamed from: b */
    private HaBridge f51971b = new HaBridge(HaBridge.HA_SERVICE_TAG_ABTEST);

    public C17567c(Context context, String str) {
        this.f51970a = str;
        SharedPrefUtil.init(context);
        C17568d.m75321a();
    }

    /* JADX INFO: renamed from: a */
    private ArrayList<C17565a> m75315a(List<C17565a> list, Set<String> set) {
        ArrayList<C17565a> arrayList = new ArrayList<>();
        for (C17565a c17565a : list) {
            if (!set.contains(c17565a.m75307a())) {
                arrayList.add(c17565a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private ArrayList<C17565a> m75318b(List<C17565a> list, Set<String> set) {
        ArrayList<C17565a> arrayList = new ArrayList<>();
        for (C17565a c17565a : list) {
            if (!set.contains(c17565a.m75307a())) {
                arrayList.add(c17565a);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.agconnect.abtest.AGConnectABTesting
    public void removeAllExperiments() {
        m75319b(C17568d.m75320a(this.f51970a));
        C17568d.m75324b();
    }

    @Override // com.huawei.agconnect.abtest.AGConnectABTesting
    public void replaceAllExperiments(List<Map<String, String>> list) throws ABTestException {
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            C17565a c17565aM75305a = C17565a.m75305a(it.next());
            arrayList.add(c17565aM75305a);
            hashSet.add(c17565aM75305a.m75307a());
        }
        List<C17565a> listM75320a = C17568d.m75320a(this.f51970a);
        HashSet hashSet2 = new HashSet();
        Iterator<C17565a> it2 = listM75320a.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().m75307a());
        }
        m75319b(m75315a(listM75320a, hashSet));
        m75317a(m75318b(arrayList, hashSet2));
        C17568d.m75324b();
    }

    /* JADX INFO: renamed from: a */
    private void m75316a(C17565a c17565a) {
        if (c17565a.m75310c() == null || c17565a.m75310c().length() == 0) {
            Bundle bundle = new Bundle();
            bundle.putString("$ABTaskId", c17565a.m75307a());
            bundle.putString("$ABVarId", c17565a.m75309b());
            bundle.putString("$ABChannel", this.f51970a);
            Logger.m75326d("ABTest", "report ab test event");
            this.f51971b.onEvent("$JoinABTask", bundle);
            c17565a.m75308a(true);
        }
        C17568d.m75323a(c17565a, this.f51970a);
    }

    /* JADX INFO: renamed from: b */
    private void m75319b(List<C17565a> list) {
        Iterator<C17565a> it = list.iterator();
        while (it.hasNext()) {
            C17568d.m75322a(it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m75317a(List<C17565a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(C17568d.m75320a(this.f51970a));
        for (C17565a c17565a : list) {
            while (arrayDeque.size() >= 25) {
                C17565a c17565a2 = (C17565a) arrayDeque.pollFirst();
                if (c17565a2 != null) {
                    C17568d.m75322a(c17565a2);
                }
            }
            m75316a(c17565a);
            arrayDeque.offer(c17565a);
        }
    }
}
