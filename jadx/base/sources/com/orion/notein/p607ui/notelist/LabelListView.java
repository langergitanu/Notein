package com.orion.notein.p607ui.notelist;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.R$styleable;
import com.orion.notein.domain.models.Label;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33600OooOo0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/LabelListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/orion/notein/ui/vo/ItemLabelVO;", "labels", "LoO00ooO/OooOooO;", "setLabels", "(Ljava/util/List;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabelListView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TextView f77007OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f77008OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f77009OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List<ItemLabelVO> f77010OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f77010OooOoO0 = C34434OooOoO.f123453OooOo0o;
        View.inflate(context, R.layout.view_label_list, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f69776OooO00o, 0, 0);
        OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f77009OooOoO = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(List<ItemLabelVO> list) throws Throwable {
        Throwable th;
        int i;
        int size;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TextView textView = this.f77008OooOo0o;
        if (textView == null) {
            OooOOO0.OooOOOO("labelListTextView");
            throw null;
        }
        int width = textView.getWidth();
        Iterator<ItemLabelVO> it = list.iterator();
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                th = null;
                i = 0;
                break;
            }
            ItemLabelVO next = it.next();
            Label.Companion companion = Label.INSTANCE;
            TextView textView2 = this.f77008OooOo0o;
            if (textView2 == null) {
                OooOOO0.OooOOOO("labelListTextView");
                throw null;
            }
            Context context = textView2.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            String str = next.f80080OooOo;
            int i3 = next.f80083OooOoO0;
            SpannableString spannableString = companion.formatSpannableString(context, str, i3);
            TextView textView3 = this.f77008OooOo0o;
            if (textView3 == null) {
                OooOOO0.OooOOOO("labelListTextView");
                throw null;
            }
            TextPaint paint = textView3.getPaint();
            th = null;
            StringBuilder sb = new StringBuilder(" ");
            String strO0OoOo0 = next.f80080OooOo;
            sb.append(strO0OoOo0);
            sb.append(" ");
            float fMeasureText = paint.measureText(sb.toString()) + (companion.getDEFAULT_PADDING() * 2);
            if (i2 == 0) {
                float f2 = width;
                if (fMeasureText > f2) {
                    while (fMeasureText > f2 && strO0OoOo0.length() > 0) {
                        OooOOO0.OooO0oO(strO0OoOo0, "<this>");
                        int length = strO0OoOo0.length() - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        strO0OoOo0 = C33600OooOo0o.o0OoOo0(length, strO0OoOo0);
                        TextView textView4 = this.f77008OooOo0o;
                        if (textView4 == null) {
                            OooOOO0.OooOOOO("labelListTextView");
                            throw null;
                        }
                        fMeasureText = (Label.INSTANCE.getDEFAULT_PADDING() * 2) + textView4.getPaint().measureText(" " + strO0OoOo0 + "... ");
                    }
                    Label.Companion companion2 = Label.INSTANCE;
                    TextView textView5 = this.f77008OooOo0o;
                    if (textView5 == null) {
                        OooOOO0.OooOOOO("labelListTextView");
                        throw null;
                    }
                    Context context2 = textView5.getContext();
                    OooOOO0.OooO0o(context2, "getContext(...)");
                    SpannableString spannableString2 = companion2.formatSpannableString(context2, strO0OoOo0 + "...", i3);
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) spannableString2);
                    i2++;
                    size = list.size();
                } else {
                    f += fMeasureText;
                    if (f > width) {
                        size = list.size();
                        break;
                    } else {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableString);
                        i2++;
                    }
                }
            }
        }
        i = size - i2;
        TextView textView6 = this.f77008OooOo0o;
        if (textView6 == null) {
            OooOOO0.OooOOOO("labelListTextView");
            throw th;
        }
        textView6.setText(spannableStringBuilder);
        TextView textView7 = this.f77007OooOo;
        if (textView7 == null) {
            OooOOO0.OooOOOO("hiddenLabelCountTextView");
            throw th;
        }
        textView7.setVisibility(i > 0 ? 0 : 8);
        TextView textView8 = this.f77007OooOo;
        if (textView8 == null) {
            OooOOO0.OooOOOO("hiddenLabelCountTextView");
            throw th;
        }
        textView8.setText("+" + i);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f77008OooOo0o = (TextView) findViewById(R.id.label_list);
        this.f77007OooOo = (TextView) findViewById(R.id.hidden_label_count);
        if (this.f77009OooOoO == 0) {
            TextView textView = this.f77008OooOo0o;
            if (textView != null) {
                textView.setGravity(17);
                return;
            } else {
                OooOOO0.OooOOOO("labelListTextView");
                throw null;
            }
        }
        TextView textView2 = this.f77008OooOo0o;
        if (textView2 != null) {
            textView2.setGravity(8388627);
        } else {
            OooOOO0.OooOOOO("labelListTextView");
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            OooO00o(this.f77010OooOoO0);
        }
    }

    public final void setLabels(List<ItemLabelVO> labels) throws Throwable {
        OooOOO0.OooO0oO(labels, "labels");
        this.f77010OooOoO0 = labels;
        OooO00o(labels);
        requestLayout();
    }
}
