package org.example.AOP;

@Aspect
public class ClassDiagramLoggingAspect {
    @Before("@annotation(Log)")
    public void logAction(JoinPoint joinPoint) {
        // Journaliser l'action avant qu'elle ne soit effectuée
    }
}
