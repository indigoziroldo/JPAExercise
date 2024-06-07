# JPAExercise

# anotações

enums:
    locomocao
    confirmado
package:
    local
        (one to many[dependendo do horário] - churrasco)
        classes e interface
    tipoalimento
        classes e interfaces
    alimento
        (many to many - pessoa e churrasco)
        classes e interfaces
    pessoa
        (many to many - alimento e churrasco)
        classes e interfaces
    churrasco
        (many to one [dependendo do horário] - local)
        (many to many - alimento e pessoa)
        classes e interfaces
		