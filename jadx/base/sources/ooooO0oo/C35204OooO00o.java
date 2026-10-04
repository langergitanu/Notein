package ooooO0oo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import ooooOOo0.C35240OooOoOO;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: ooooO0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35204OooO00o extends InterfaceC35214OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Gson f126414OooO00o;

    public C35204OooO00o(Gson gson) {
        this.f126414OooO00o = gson;
    }

    public static C35204OooO00o OooO0OO() {
        return new C35204OooO00o(new Gson());
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o.OooO00o
    public final InterfaceC35214OooO0o OooO00o(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f126414OooO00o;
        return new C35205OooO0O0(gson, gson.getAdapter(typeToken));
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o.OooO00o
    public final InterfaceC35214OooO0o<ResponseBody, ?> OooO0O0(Type type, Annotation[] annotationArr, C35240OooOoOO c35240OooOoOO) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f126414OooO00o;
        return new C35206OooO0OO(gson, gson.getAdapter(typeToken));
    }
}
