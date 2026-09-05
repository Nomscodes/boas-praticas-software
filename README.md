# 📚 Boas Práticas de Software

Projeto de refatoração de código aplicando boas práticas estudadas na disciplina de Manutenção e Configuração de Software.

---

## ✅ Respostas da Atividade

### 1️⃣ Qual era o principal problema do código original?

O código tinha nomes de variáveis pouco descritivos (n, a, b, c) e toda a lógica concentrada em um único método main. Isso dificultava a compreensão e manutenção do código.

### 2️⃣ Quais melhorias você realizou?

Melhorei os nomes das variáveis: `nomeAluno`, `nota1`, `nota2`, `media`. Separei o código em métodos com responsabilidades específicas: `calcularMedia()`, `exibirResultados()` e `verificarSituacao()`. Adicionei comentários explicativos apenas onde necessário.

### 3️⃣ Como a modularização facilitou a organização do código?

Cada método ficou com uma responsabilidade clara. O código fica mais fácil de entender, testar e manter. Se precisar mudar algo, sabe exatamente onde procurar.

### 4️⃣ Como o Git ajudou a controlar as alterações realizadas no sistema?

O Git rastreou cada mudança pelos commits. A branch `melhoria-boas-praticas` isolou as alterações, o Pull Request documentou as mudanças, e o histórico mostra exatamente o que foi feito.

---

## 📝 Resumo do Processo

✅ Código original criado e commitado  
✅ Branch `melhoria-boas-praticas` criada  
✅ Refatoração realizada  
✅ Pull Request aberto  
✅ Merge concluído
