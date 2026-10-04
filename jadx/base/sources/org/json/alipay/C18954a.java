package org.json.alipay;

import Oooo0oO.o0Oo0oo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: org.json.alipay.a */
/* JADX INFO: loaded from: classes10.dex */
public class C18954a {

    /* JADX INFO: renamed from: a */
    public ArrayList f58131a;

    public C18954a() {
        this.f58131a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final int m80646a() {
        return this.f58131a.size();
    }

    public String toString() {
        try {
            return "[" + m80645a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public C18954a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f58131a.add(Array.get(obj, i));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m80647a(int i) throws JSONException {
        Object obj = (i < 0 || i >= this.f58131a.size()) ? null : this.f58131a.get(i);
        if (obj != null) {
            return obj;
        }
        throw new JSONException(o0Oo0oo.OooO0O0(i, "JSONArray[", "] not found."));
    }

    public C18954a(String str) {
        this(new C18956c(str));
    }

    public C18954a(Collection collection) {
        this.f58131a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public C18954a(C18956c c18956c) throws JSONException {
        char c;
        ArrayList arrayList;
        Object objM80659d;
        this();
        char cM80658c = c18956c.m80658c();
        if (cM80658c == '[') {
            c = ']';
        } else {
            if (cM80658c != '(') {
                throw c18956c.m80655a("A JSONArray text must start with '['");
            }
            c = ')';
        }
        if (c18956c.m80658c() == ']') {
            return;
        }
        do {
            c18956c.m80656a();
            char cM80658c2 = c18956c.m80658c();
            c18956c.m80656a();
            if (cM80658c2 == ',') {
                arrayList = this.f58131a;
                objM80659d = null;
            } else {
                arrayList = this.f58131a;
                objM80659d = c18956c.m80659d();
            }
            arrayList.add(objM80659d);
            char cM80658c3 = c18956c.m80658c();
            if (cM80658c3 != ')') {
                if (cM80658c3 != ',' && cM80658c3 != ';') {
                    if (cM80658c3 != ']') {
                        throw c18956c.m80655a("Expected a ',' or ']'");
                    }
                }
            }
            if (c == cM80658c3) {
                return;
            }
            throw c18956c.m80655a("Expected a '" + new Character(c) + "'");
        } while (c18956c.m80658c() != ']');
    }

    /* JADX INFO: renamed from: a */
    private String m80645a(String str) {
        int size = this.f58131a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(C18955b.m80648a(this.f58131a.get(i)));
        }
        return stringBuffer.toString();
    }
}
