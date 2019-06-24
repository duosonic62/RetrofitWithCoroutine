package retrofit.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lretrofit/model/Employee;", "", "id", "", "employee_name", "", "employee_salary", "employee_age", "profile_image", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getEmployee_age", "()I", "getEmployee_name", "()Ljava/lang/String;", "getEmployee_salary", "getId", "getProfile_image", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "LearnCorutin"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Employee {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String employee_name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String employee_salary = null;
    private final int employee_age = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String profile_image = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmployee_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmployee_salary() {
        return null;
    }
    
    public final int getEmployee_age() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfile_image() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonCreator
    public Employee(@com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "employee_name")
    @com.squareup.moshi.Json(name = "employee_name")
    java.lang.String employee_name, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "employee_salary")
    @com.squareup.moshi.Json(name = "employee_salary")
    java.lang.String employee_salary, @com.fasterxml.jackson.annotation.JsonProperty(value = "employee_age")
    @com.squareup.moshi.Json(name = "employee_age")
    int employee_age, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "profile_image")
    @com.squareup.moshi.Json(name = "profile_image")
    java.lang.String profile_image) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit.model.Employee copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "employee_name")
    @com.squareup.moshi.Json(name = "employee_name")
    java.lang.String employee_name, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "employee_salary")
    @com.squareup.moshi.Json(name = "employee_salary")
    java.lang.String employee_salary, @com.fasterxml.jackson.annotation.JsonProperty(value = "employee_age")
    @com.squareup.moshi.Json(name = "employee_age")
    int employee_age, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "profile_image")
    @com.squareup.moshi.Json(name = "profile_image")
    java.lang.String profile_image) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
}