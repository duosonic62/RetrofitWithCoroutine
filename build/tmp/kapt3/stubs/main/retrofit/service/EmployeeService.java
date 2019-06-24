package retrofit.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lretrofit/service/EmployeeService;", "", "()V", "service", "Lretrofit/api/EmployeeApi;", "kotlin.jvm.PlatformType", "getService", "()Lretrofit/api/EmployeeApi;", "getAsyncEmployee", "", "getAsyncEmployeeWithCall", "CustomCallBack", "LearnCorutin"})
public final class EmployeeService {
    
    public final void getAsyncEmployee() {
    }
    
    public final void getAsyncEmployeeWithCall() {
    }
    
    private final retrofit.api.EmployeeApi getService() {
        return null;
    }
    
    public EmployeeService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J0\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lretrofit/service/EmployeeService$CustomCallBack;", "Lretrofit2/Callback;", "", "Lretrofit/model/Employee;", "()V", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "LearnCorutin"})
    static final class CustomCallBack implements retrofit2.Callback<java.util.List<? extends retrofit.model.Employee>> {
        
        @java.lang.Override
        public void onResponse(@org.jetbrains.annotations.NotNull
        retrofit2.Call<java.util.List<retrofit.model.Employee>> call, @org.jetbrains.annotations.NotNull
        retrofit2.Response<java.util.List<retrofit.model.Employee>> response) {
        }
        
        @java.lang.Override
        public void onFailure(@org.jetbrains.annotations.NotNull
        retrofit2.Call<java.util.List<retrofit.model.Employee>> call, @org.jetbrains.annotations.NotNull
        java.lang.Throwable t) {
        }
        
        public CustomCallBack() {
            super();
        }
    }
}