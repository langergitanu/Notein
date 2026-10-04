package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28150OooO0OO;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/ai/StatusDisplayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/orion/notein/ui/noteeditor/propertypanel/ai/StatusDisplayView$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LoO00ooO/OooOooO;", "setOnRetryListener", "(Lcom/orion/notein/ui/noteeditor/propertypanel/ai/StatusDisplayView$OooO00o;)V", "Lcom/orion/notein/ui/noteeditor/propertypanel/ai/OooO00o$OooO0Oo;", NotificationCompat.CATEGORY_MESSAGE, "setStatueMessage", "(Lcom/orion/notein/ui/noteeditor/propertypanel/ai/OooO00o$OooO0Oo;)V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StatusDisplayView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TextView f75701OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f75702OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f75703OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f75704OooOoO0;

    public interface OooO00o {
        void OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusDisplayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        View.inflate(context, R.layout.view_ai_error, this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooO00o(OooO00o.C23517OooO0Oo c23517OooO0Oo) {
        TextView textView = this.f75701OooOo;
        if (textView == null) {
            OooOOO0.OooOOOO("statusText");
            throw null;
        }
        String str = c23517OooO0Oo.f75656OooO0OO;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        String str2 = c23517OooO0Oo.f75655OooO0O0;
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != 325557075) {
                if (iHashCode != 1448635047) {
                    if (iHashCode != 1457223782) {
                        switch (iHashCode) {
                            case 1534522494:
                                if (str2.equals("400002")) {
                                    View view = this.f75703OooOoO;
                                    if (view == null) {
                                        OooOOO0.OooOOOO("btnRetry");
                                        throw null;
                                    }
                                    view.setVisibility(8);
                                    View view2 = this.f75704OooOoO0;
                                    if (view2 != null) {
                                        view2.setVisibility(8);
                                        return;
                                    } else {
                                        OooOOO0.OooOOOO("circleView");
                                        throw null;
                                    }
                                }
                                break;
                            case 1534522495:
                                if (str2.equals("400003")) {
                                    View view3 = this.f75703OooOoO;
                                    if (view3 == null) {
                                        OooOOO0.OooOOOO("btnRetry");
                                        throw null;
                                    }
                                    view3.setVisibility(8);
                                    View view4 = this.f75704OooOoO0;
                                    if (view4 != null) {
                                        view4.setVisibility(8);
                                        return;
                                    } else {
                                        OooOOO0.OooOOOO("circleView");
                                        throw null;
                                    }
                                }
                                break;
                            case 1534522496:
                                if (str2.equals("400004")) {
                                    View view5 = this.f75703OooOoO;
                                    if (view5 == null) {
                                        OooOOO0.OooOOOO("btnRetry");
                                        throw null;
                                    }
                                    view5.setVisibility(8);
                                    View view6 = this.f75704OooOoO0;
                                    if (view6 != null) {
                                        view6.setVisibility(8);
                                        return;
                                    } else {
                                        OooOOO0.OooOOOO("circleView");
                                        throw null;
                                    }
                                }
                                break;
                            case 1534522497:
                                if (str2.equals("400005")) {
                                    View view7 = this.f75703OooOoO;
                                    if (view7 == null) {
                                        OooOOO0.OooOOOO("btnRetry");
                                        throw null;
                                    }
                                    view7.setVisibility(0);
                                    View view8 = this.f75704OooOoO0;
                                    if (view8 != null) {
                                        view8.setVisibility(8);
                                        return;
                                    } else {
                                        OooOOO0.OooOOOO("circleView");
                                        throw null;
                                    }
                                }
                                break;
                            case 1534522498:
                                if (str2.equals("400006")) {
                                    View view9 = this.f75703OooOoO;
                                    if (view9 == null) {
                                        OooOOO0.OooOOOO("btnRetry");
                                        throw null;
                                    }
                                    view9.setVisibility(0);
                                    View view10 = this.f75704OooOoO0;
                                    if (view10 != null) {
                                        view10.setVisibility(8);
                                        return;
                                    } else {
                                        OooOOO0.OooOOOO("circleView");
                                        throw null;
                                    }
                                }
                                break;
                            case 1534522499:
                                if (str2.equals("400007")) {
                                    View view11 = this.f75703OooOoO;
                                    if (view11 == null) {
                                        OooOOO0.OooOOOO("btnRetry");
                                        throw null;
                                    }
                                    view11.setVisibility(0);
                                    View view12 = this.f75704OooOoO0;
                                    if (view12 != null) {
                                        view12.setVisibility(8);
                                        return;
                                    } else {
                                        OooOOO0.OooOOOO("circleView");
                                        throw null;
                                    }
                                }
                                break;
                            case 1534522500:
                                if (str2.equals("400008")) {
                                    View view13 = this.f75703OooOoO;
                                    if (view13 == null) {
                                        OooOOO0.OooOOOO("btnRetry");
                                        throw null;
                                    }
                                    view13.setVisibility(0);
                                    View view14 = this.f75704OooOoO0;
                                    if (view14 != null) {
                                        view14.setVisibility(8);
                                        return;
                                    } else {
                                        OooOOO0.OooOOOO("circleView");
                                        throw null;
                                    }
                                }
                                break;
                        }
                    } else if (str2.equals("199997")) {
                        View view15 = this.f75703OooOoO;
                        if (view15 == null) {
                            OooOOO0.OooOOOO("btnRetry");
                            throw null;
                        }
                        view15.setVisibility(0);
                        View view16 = this.f75704OooOoO0;
                        if (view16 != null) {
                            view16.setVisibility(8);
                            return;
                        } else {
                            OooOOO0.OooOOOO("circleView");
                            throw null;
                        }
                    }
                } else if (str2.equals("100008")) {
                    View view17 = this.f75703OooOoO;
                    if (view17 == null) {
                        OooOOO0.OooOOOO("btnRetry");
                        throw null;
                    }
                    view17.setVisibility(0);
                    View view18 = this.f75704OooOoO0;
                    if (view18 != null) {
                        view18.setVisibility(8);
                        return;
                    } else {
                        OooOOO0.OooOOOO("circleView");
                        throw null;
                    }
                }
            } else if (str2.equals("4000010")) {
                View view19 = this.f75703OooOoO;
                if (view19 == null) {
                    OooOOO0.OooOOOO("btnRetry");
                    throw null;
                }
                view19.setVisibility(0);
                View view20 = this.f75704OooOoO0;
                if (view20 != null) {
                    view20.setVisibility(8);
                    return;
                } else {
                    OooOOO0.OooOOOO("circleView");
                    throw null;
                }
            }
        }
        View view21 = this.f75703OooOoO;
        if (view21 == null) {
            OooOOO0.OooOOOO("btnRetry");
            throw null;
        }
        view21.setVisibility(0);
        View view22 = this.f75704OooOoO0;
        if (view22 != null) {
            view22.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("circleView");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f75701OooOo = (TextView) findViewById(R.id.tv_error_message);
        this.f75704OooOoO0 = findViewById(R.id.circularIndicator);
        View viewFindViewById = findViewById(R.id.btn_retry);
        this.f75703OooOoO = viewFindViewById;
        if (viewFindViewById != null) {
            C28050OooO0OO.OooO00o(viewFindViewById, 1000L, new ViewOnClickListenerC28150OooO0OO(this, 1));
        } else {
            OooOOO0.OooOOOO("btnRetry");
            throw null;
        }
    }

    public final void setOnRetryListener(OooO00o listener) {
        OooOOO0.OooO0oO(listener, "listener");
        this.f75702OooOo0o = listener;
    }

    public final void setStatueMessage(OooO00o.C23517OooO0Oo msg) {
        if (msg == null) {
            setVisibility(8);
            return;
        }
        View view = this.f75703OooOoO;
        if (view == null) {
            OooOOO0.OooOOOO("btnRetry");
            throw null;
        }
        view.setVisibility(8);
        View view2 = this.f75704OooOoO0;
        if (view2 == null) {
            OooOOO0.OooOOOO("circleView");
            throw null;
        }
        view2.setVisibility(8);
        View view3 = this.f75704OooOoO0;
        if (view3 == null) {
            OooOOO0.OooOOOO("circleView");
            throw null;
        }
        OooO00o.OooO0OO.C19359OooO00o c19359OooO00o = OooO00o.OooO0OO.C19359OooO00o.f75648OooO00o;
        OooO00o.OooO0OO oooO0OO = msg.f75654OooO00o;
        view3.setVisibility(OooOOO0.OooO0O0(oooO0OO, c19359OooO00o) || OooOOO0.OooO0O0(oooO0OO, OooO00o.OooO0OO.OooO0Oo.f75651OooO00o) || OooOOO0.OooO0O0(oooO0OO, OooO00o.OooO0OO.OooO0o.f75652OooO00o) ? 0 : 8);
        if (OooOOO0.OooO0O0(oooO0OO, c19359OooO00o)) {
            TextView textView = this.f75701OooOo;
            if (textView == null) {
                OooOOO0.OooOOOO("statusText");
                throw null;
            }
            textView.setText("");
            setVisibility(0);
            return;
        }
        if (OooOOO0.OooO0O0(oooO0OO, OooO00o.OooO0OO.OooO0Oo.f75651OooO00o)) {
            TextView textView2 = this.f75701OooOo;
            if (textView2 == null) {
                OooOOO0.OooOOOO("statusText");
                throw null;
            }
            textView2.setText(getContext().getString(R.string.ai_state_uploading));
            setVisibility(0);
            return;
        }
        if (OooOOO0.OooO0O0(oooO0OO, OooO00o.OooO0OO.C19360OooO0OO.f75650OooO00o)) {
            OooO00o(msg);
            setVisibility(0);
            return;
        }
        if (OooOOO0.OooO0O0(oooO0OO, OooO00o.OooO0OO.OooO0o.f75652OooO00o)) {
            TextView textView3 = this.f75701OooOo;
            if (textView3 == null) {
                OooOOO0.OooOOOO("statusText");
                throw null;
            }
            textView3.setText(getContext().getString(R.string.ai_state_vectorizing));
            setVisibility(0);
            return;
        }
        if (OooOOO0.OooO0O0(oooO0OO, OooO00o.OooO0OO.C23516OooO0o0.f75653OooO00o)) {
            OooO00o(msg);
            setVisibility(0);
        } else {
            if (!OooOOO0.OooO0O0(oooO0OO, OooO00o.OooO0OO.OooO0O0.f75649OooO00o)) {
                throw new C32442OooOO0o();
            }
            TextView textView4 = this.f75701OooOo;
            if (textView4 == null) {
                OooOOO0.OooOOOO("statusText");
                throw null;
            }
            textView4.setText("");
            setVisibility(8);
        }
    }
}
