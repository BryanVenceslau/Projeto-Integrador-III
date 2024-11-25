document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('fomulario-aluno').addEventListener('submit', function (event) {
        // Impedir envio do formulário por padrão
        event.preventDefault();

        // limpando campos de erro
        document.getElementById('erro-nome').innerHTML = '';
        document.getElementById('erro-cpf').innerHTML = '';
        document.getElementById('erro-data').innerHTML = '';
        document.getElementById('erro-matricula').innerHTML = '';
        document.getElementById('erro-telefone').innerHTML = '';

        // pegando valores
        let nome = document.getElementById('inputNome').value.trim();
        let cpf = document.getElementById('inputCpf').value.trim();
        let data = document.getElementById('inputData').value.trim();
        let matricula = document.getElementById('inputMatricula').value.trim();
        let telefone = document.getElementById('inputTelefone').value.trim();

        let hasError = false; // flag para indicar erros

        if (nome === '') {
            document.getElementById('erro-nome').innerHTML = 'Campo {Nome} não pode ser vazio';
            hasError = true;
        }

        if (cpf === '') {
            document.getElementById('erro-cpf').innerHTML = 'Campo {CPF} não pode ser vazio';
            document.getElementById('labelCpf').innerHTML = '*Cpf'; // Adiciona o * no label
            hasError = true;
        }

        if (matricula === '' || isNaN(matricula)) {
            document.getElementById('erro-matricula').innerHTML = 'Campo {Matrícula} deve ser um número válido';
            hasError = true;
        }

        if (telefone === '') {
            document.getElementById('erro-telefone').innerHTML = 'Campo {Telefone} não pode ser vazio';
            hasError = true;
        }

        // Se houver erro, a função retorna e não prossegue
        if (hasError) {
            return;
        }

        alert('Formulário enviado com sucesso!');
    });
});

document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('formulario-funcionario').addEventListener('submit', function (event) {
        // Impedir envio do formulário por padrão
        event.preventDefault();

        // Limpando campos de erro
        document.getElementById('erro-nome').innerHTML = '';
        document.getElementById('erro-cpf').innerHTML = '';
        document.getElementById('erro-cargo').innerHTML = '';
        document.getElementById('erro-email').innerHTML = '';
        document.getElementById('erro-telefone').innerHTML = '';
        document.getElementById('erro-data-contratacao').innerHTML = '';

        // Pegando valores
        let nome = document.getElementById('inputNome').value.trim();
        let cpf = document.getElementById('inputCpf').value.trim();
        let cargo = document.getElementById('inputCargo').value.trim();
        let email = document.getElementById('inputEmail').value.trim();
        let telefone = document.getElementById('inputTelefone').value.trim();
        let dataContratacao = document.getElementById('inputDataContratacao').value.trim();

        let hasError = false; // flag para indicar erros

        // Verificação do campo Nome
        if (nome === '') {
            document.getElementById('erro-nome').innerHTML = 'Campo {Nome} não pode ser vazio';
            hasError = true;
        }

        // Verificação do campo CPF
        if (cpf === '') {
            document.getElementById('erro-cpf').innerHTML = 'Campo {CPF} não pode ser vazio';
            hasError = true;
        } else if (!/^\d{11}$/.test(cpf)) { // Regex simples para validar CPF com 11 dígitos
            document.getElementById('erro-cpf').innerHTML = 'CPF inválido. Deve conter 11 dígitos';
            hasError = true;
        }

        // Verificação do campo Cargo
        if (cargo === '') {
            document.getElementById('erro-cargo').innerHTML = 'Campo {Cargo} não pode ser vazio';
            hasError = true;
        }

        // Verificação do campo E-mail
        if (email === '') {
            document.getElementById('erro-email').innerHTML = 'Campo {E-mail} não pode ser vazio';
            hasError = true;
        } else if (!/\S+@\S+\.\S+/.test(email)) { // Validação simples de e-mail
            document.getElementById('erro-email').innerHTML = 'E-mail inválido';
            hasError = true;
        }

        // Verificação do campo Telefone
        if (telefone === '') {
            document.getElementById('erro-telefone').innerHTML = 'Campo {Telefone} não pode ser vazio';
            hasError = true;
        } else if (!/^\d+$/.test(telefone)) { // Verificação se o telefone contém apenas números
            document.getElementById('erro-telefone').innerHTML = 'Telefone deve conter apenas números';
            hasError = true;
        }

        // Verificação do campo Data de contratação
        if (dataContratacao === '') {
            document.getElementById('erro-data-contratacao').innerHTML = 'Campo {Data da contratação} não pode ser vazio';
            hasError = true;
        }

        // Se houver erro, não prossegue
        if (hasError) {
            return;
        }

        // Se tudo estiver correto, pode prosseguir
        alert('Formulário enviado com sucesso!');
    });
});

document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('formulario-turma').addEventListener('submit', function (event) {
        // Impedir envio do formulário por padrão
        event.preventDefault();

        // Limpando mensagens de erro
        document.getElementById('erro-numero-turma').innerHTML = '';
        document.getElementById('erro-professor').innerHTML = '';
        document.getElementById('erro-turno').innerHTML = '';
        document.getElementById('erro-numero-alunos').innerHTML = '';

        // Pegando valores dos campos
        let numeroTurma = document.getElementById('inputNumeroTurma').value.trim();
        let professor = document.getElementById('inputProfessor').value.trim();
        let turno = document.getElementById('inputTurno').value.trim();
        let numeroAlunos = document.getElementById('inputNumeroAlunos').value.trim();

        let hasError = false; // Flag para indicar erros

        // Verificação do campo Número da Turma
        if (numeroTurma === '') {
            document.getElementById('erro-numero-turma').innerHTML = 'Campo {Número da Turma} não pode ser vazio';
            hasError = true;
        }

        // Verificação do campo Professor
        if (professor === '') {
            document.getElementById('erro-professor').innerHTML = 'Campo {Professor} não pode ser vazio';
            hasError = true;
        }

        // Verificação do campo Turno
        if (turno === '') {
            document.getElementById('erro-turno').innerHTML = 'Campo {Turno} não pode ser vazio';
            hasError = true;
        }

        // Verificação do campo Número de Alunos
        if (numeroAlunos === '' || isNaN(numeroAlunos) || parseInt(numeroAlunos) <= 0) {
            document.getElementById('erro-numero-alunos').innerHTML = 'Campo {Número de Alunos} deve ser um número válido maior que zero';
            hasError = true;
        }

        // Se houver erro, não prossegue
        if (hasError) {
            return;
        }

        // Se tudo estiver correto, pode prosseguir
        alert('Formulário enviado com sucesso!');
    });
});