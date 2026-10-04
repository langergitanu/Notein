package o000O000;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f82286OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Class<?> f82287OooOo0o;

    public static class OooO00o implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AtomicInteger f82288OooOo = new AtomicInteger(0);

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Object f82289OooOo0o;

        public OooO00o(Object obj) {
            this.f82289OooOo0o = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f82289OooOo0o).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f82289OooOo0o).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f82288OooOo.get() <= 0 || !(obj instanceof OooO)) {
                ((SpanWatcher) this.f82289OooOo0o).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
          0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f82288OooOo.get() <= 0 || !(obj instanceof OooO)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    }
                }
                ((SpanWatcher) this.f82289OooOo0o).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f82288OooOo.get() <= 0 || !(obj instanceof OooO)) {
                ((SpanWatcher) this.f82289OooOo0o).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f82289OooOo0o).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public OooOOO0(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f82286OooOo = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f82287OooOo0o = cls;
    }

    public final void OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f82286OooOo;
            if (i >= arrayList.size()) {
                return;
            }
            ((OooO00o) arrayList.get(i)).f82288OooOo.incrementAndGet();
            i++;
        }
    }

    public final void OooO0O0() {
        OooO0o0();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f82286OooOo;
            if (i >= arrayList.size()) {
                return;
            }
            ((OooO00o) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final OooO00o OooO0OO(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f82286OooOo;
            if (i >= arrayList.size()) {
                return null;
            }
            OooO00o oooO00o = (OooO00o) arrayList.get(i);
            if (oooO00o.f82289OooOo0o == obj) {
                return oooO00o;
            }
            i++;
        }
    }

    public final boolean OooO0Oo(Object obj) {
        if (obj != null) {
            return this.f82287OooOo0o == obj.getClass();
        }
        return false;
    }

    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f82286OooOo;
            if (i >= arrayList.size()) {
                return;
            }
            ((OooO00o) arrayList.get(i)).f82288OooOo.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (this.f82287OooOo0o != cls) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        OooO00o[] oooO00oArr = (OooO00o[]) super.getSpans(i, i2, OooO00o.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, oooO00oArr.length));
        for (int i3 = 0; i3 < oooO00oArr.length; i3++) {
            tArr[i3] = oooO00oArr[i3].f82289OooOo0o;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f82287OooOo0o == cls) {
            cls = OooO00o.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj)) {
            oooO00oOooO0OO = OooO0OO(obj);
            if (oooO00oOooO0OO != null) {
                obj = oooO00oOooO0OO;
            }
        } else {
            oooO00oOooO0OO = null;
        }
        super.removeSpan(obj);
        if (oooO00oOooO0OO != null) {
            this.f82286OooOo.remove(oooO00oOooO0OO);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (OooO0Oo(obj)) {
            OooO00o oooO00o = new OooO00o(obj);
            this.f82286OooOo.add(oooO00o);
            obj = oooO00o;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new OooOOO0(this.f82287OooOo0o, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        OooO00o();
        super.replace(i, i2, charSequence);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public OooOOO0(Class cls, OooOOO0 oooOOO0, int i, int i2) {
        super(oooOOO0, i, i2);
        this.f82286OooOo = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f82287OooOo0o = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        OooO00o();
        super.replace(i, i2, charSequence, i3, i4);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
